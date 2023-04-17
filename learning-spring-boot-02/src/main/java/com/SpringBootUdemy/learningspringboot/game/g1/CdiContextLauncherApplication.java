package com.SpringBootUdemy.learningspringboot.game.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
//@Named              // is a replacement for @Component
class BusinessService{
    private DataService dataService;
    @Autowired
//    @Inject  //- is replacement for @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection performed");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

}

@Component
class DataService{

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());
        }


    }
}
