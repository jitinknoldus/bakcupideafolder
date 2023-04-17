package com.knoldus1;


import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println("Roll no is: " + this.getRollNo());
    }
}
