package com.knoldus.SpringJpaJavaBrains.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

//    @GetMapping("/topics/{id}")
//    public Topic getTopic(@PathVariable String id){
//        return topicService.getTopic(id);
//    }

    @PostMapping("/addtopic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping("/updatetopic/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id,topic);
    }

    @DeleteMapping("/deletetopic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
