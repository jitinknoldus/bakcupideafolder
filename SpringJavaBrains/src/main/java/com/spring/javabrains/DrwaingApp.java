package com.spring.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class DrwaingApp {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        triangle.draw();

//        Method 1: Using Bean Factory
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/home/knoldus/IdeaProjects/SpringJavaBrains/src/main/resources/spring.xml"));
//        Triangle triangle =(Triangle) factory.getBean("triangle");
//        triangle.draw();

//        Method 2: Using ApllicationContext
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Triangle triangle = (Triangle) context.getBean("triangle");
//        triangle.draw();

//        Learning Annotations
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            Triangle triangle = (Triangle) context.getBean("triangle");
            triangle.draw();



    }
}
