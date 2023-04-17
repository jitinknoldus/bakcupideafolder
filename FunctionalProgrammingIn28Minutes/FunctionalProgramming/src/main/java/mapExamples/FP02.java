package mapExamples;

import java.util.ArrayList;
import java.util.List;

public class FP02 {

    private static void sqaureOfEvenNumbers(List<Integer> list) {
        list.stream().filter(number->number%2==0).map(i->i*i).forEach(System.out::println);
    }

    private static void cubesOfOddNumbers(List<Integer> list) {
        list.stream().filter(number->number%2!=0).map(i->i*i*i).forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(15);

        List<String> courses = new ArrayList<>();
        courses.add("Spring");
        courses.add("SpringBoot");
        courses.add("APT");
        courses.add("Microservices");
        courses.add("AWS");
        courses.add("PCF");
        courses.add("Azure");
        courses.add("Docker");
        courses.add("Kubernetes");

        //squares of even numbers
        System.out.println("Squares of Even Numbers");
        sqaureOfEvenNumbers(list);

        //cubes of odd numbers
        System.out.println("Cubes of Odd Numbers: ");
        cubesOfOddNumbers(list);

        //printing the number of characters is each course
        System.out.println("Printing each course length");
        courses.stream().map(course->course + ": " + course.length()).forEach(System.out::println);



    }


}
