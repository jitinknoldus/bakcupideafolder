package com.knoldus1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;





 class Teacher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.knoldus1");
        context.refresh();
        Student student = context.getBean(Student.class);
        student.setRollNo(10);
        student.display();
    }
}
