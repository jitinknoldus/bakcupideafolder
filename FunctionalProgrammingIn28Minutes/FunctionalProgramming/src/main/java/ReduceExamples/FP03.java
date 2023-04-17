package ReduceExamples;

import java.util.ArrayList;
import java.util.List;

public class FP03 {

    private static int sum(int a, int b){
        System.out.println(a + " " +b);
        return a+b;
    }

    private static int sumOfElements(List<Integer> list) {
//        return list.stream().reduce(0,FP03::sum);
//        return list.stream().reduce(0, (x,y)-> x+y );
        return list.stream().reduce(0,Integer:: sum);
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


        //printing sum of elements of list
        System.out.println(sumOfElements(list));

    }
}
