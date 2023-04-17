package com.SpringBootUdemy.learningspringboot.HelloWorld;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age){};
record Student (String name, int age, Address address){};
record Address(String firstline, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Jitin";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
       return new Person("Jitn Saxena", 23);
    }

    @Bean
    public Student student(String name, int id, Address address){
        return new Student("Saxena", 25, address());
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("Gaur city", "Greater Noida");
    }

    @Bean(name = "address2")
    public Address address2(){
        return new Address("Gaur city", "Greater Noida");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age());
    }

    @Bean
    public Student student2MethodCall(){
        return new Student(name(),age(),address());
    }

    @Bean
    public Student student3Parameters(String name, int age, Address address){
        return new Student(name,age,address);
    }


}
