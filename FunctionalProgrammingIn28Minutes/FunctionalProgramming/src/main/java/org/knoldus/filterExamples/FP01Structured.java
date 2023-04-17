package org.knoldus.filterExamples;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(12);
        numbers.add(9);
        numbers.add(13);
        numbers.add(4);
        numbers.add(6);
        numbers.add(12);
        numbers.add(15);
//        printAllNumbersInListStructured(numbers);
//        System.out.println("\n Printing even");
//
        //printing all even numbers
//        printAllEvenNumbers(numbers);

//        List<String> courses = List.of("Spring", "SpringBoot", "APT", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        //printing all the courses
        //        courses.stream().forEach(System.out::println);

        //printing the courses which contains spring word in it
//        courses.stream().filter(course-> course.contains("Spring")).forEach(System.out::println);

        //printing the course which contains more than 4 letters
//        courses.stream().filter(course->course.length()>4).forEach(System.out::println);

        //printing all odd numbers
        printAllOddNumbers(numbers);

    }

    private static void printAllOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
    }

    private static void printAllEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }

    private static boolean isEven(Integer integer) {
        return integer%2 == 0;
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        //functional approach
        numbers.stream().forEach(FP01Structured::print);            //method1
//            numbers.stream().forEach(System.out::println);        //method2
        //non functional approach
//        for(int number: numbers){
//            System.out.println(number + " ");
//        }
    }
}
