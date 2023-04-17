package com.knoldus.SpringJpaJavaBrains.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("1001", "Jitin", "Boot"),
                new Topic("1002", "Salil", "Core"),
                new Topic("1003", "Anshika", "Spring"),
                new Topic("1004", "Riya", "SpringBoot"),
                new Topic("1005", "Rahul", "Core")
        )) ;

        public List<Topic> getAllTopics()
        {
//            return topics;
            List<Topic> topics = new ArrayList<>();
            topicRepository.findAll().forEach(topics::add);
            return topics;
        }

//        public Topic getTopic(String id){
//            return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
//            Topic topic;
//            for(int i=0; i<topics.size(); i++){
//                Topic t = topics.get(i);
//
//                if(t.getId().equals(id)){
//                    return topics.get(i);
//                }
//            }
//            return null;
//           Optional<Topic> topic =  topicRepository.findById(id);
//        }

        public void addTopic(Topic topic){
//            topics.add(topic);
            topicRepository.save(topic);
        }

        public void updateTopic(String id, Topic topic){
            for(int index=0; index<topics.size(); index++){
                Topic t = topics.get(index);
                if(t.getId().equals(id)){
                    t.setId(topic.getId());
                    t.setName(topic.getName());
                    t.setDescription(topic.getDescription());
                }

            }
        }

        public void deleteTopic(String id){
                for(int index=0; index<topics.size(); index++){
                    Topic t = topics.get(index);
                    if(t.getId().equals(id)){
                        topics.remove(index);
                    }
            }
        }


}
