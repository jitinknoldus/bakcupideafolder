package com.knoldus.javabasics.task7;

//java basics assignment task 7
public class SimpleCalculator {

    static int sum(int a, int b){
        return a+b;
    }

    static int difference (int a, int b){
        return a-b;
    }

    static int product (int a, int b){
        return a*b;
    }

    static int quotient (int a, int b){
        return a/b;
    }


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        //sum of numbers
        System.out.println(sum(num1,num2));

        //difference of numbers
        System.out.println(difference(num1,num2));

        //product of numbers
        System.out.println(product(num1,num2));

        //quotient of numbers
        System.out.println(quotient(num1,num2));


    }
}
