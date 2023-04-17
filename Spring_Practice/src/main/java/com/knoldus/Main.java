package com.knoldus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        //Spring_Practice.Triangle object1 = new Spring_Practice.Triangle();
//        BeanFactory context = new XmlBeanFactory(new FileSystemResource("/home/knoldus/IdeaProjects/Spring_Practice/src/main/resources/spring.xml"));
//        Triangle triangle = (Triangle) context.getBean("Triangle");
//        triangle.draw();

//        ApplicationContext appcontext = new ClassPathXmlApplicationContext("spring.xml");
//        Triangle triangle = (Triangle) appcontext.getBean("Triangle");
//        triangle.draw();




            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            Triangle triangle = (Triangle) applicationContext.getBean("Triangle");
            triangle.draw();
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring.xml");
//        Point point = (Point) applicationContext1.getBean("Point");
//        point.draw();
    }
}
