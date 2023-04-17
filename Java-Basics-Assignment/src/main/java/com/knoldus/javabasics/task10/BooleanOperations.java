package com.knoldus.javabasics.task10;

//java basics assignment task 10
public class BooleanOperations {

    public static void main(String[] args) {
        Boolean isCold = true;
        Boolean isRainy = false;

        if(isCold && isRainy){
            System.out.println("Bring a jacket and an umbrella");
        }
        if (isCold && !isRainy){
            System.out.println("Bring a jacket");
        }

        if(!isCold && isRainy){
            System.out.println("Bring an umbrella");
        }

    }

}
