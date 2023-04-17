package com.example.demo;

public class Student {
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void display(){
        System.out.println("Roll No for techaer is : " + student.getRollNo());
    }
}
