package com.SpringBootUdemy.learningspringboot.HelloWorld;

import com.SpringBootUdemy.learningspringboot.HelloWorld.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a spring Context
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


        // 2. Configure the things that we want Spring to manage - @Configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name") + " " + context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("address2")); //another method to call "address" bean (byname)
        System.out.println(context.getBean(Address.class)); //another method to call "address" bean (byType)


        System.out.println(context.getBean("person2MethodCall")); //using existing beans

        System.out.println(context.getBean("student")); //using existing beans
        System.out.println(context.getBean("student2MethodCall")); //using existing beans
        System.out.println(context.getBean("student3Parameters")); //using existing beans

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // print all the beans name





    }
}
