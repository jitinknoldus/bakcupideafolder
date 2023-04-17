package Comparator_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> Emps = new ArrayList<>();
        Emps.add(new Employee("Jitn",1011,25));
        Emps.add(new Employee("Salil",1008,46));
        Emps.add(new Employee("Anshika",1003,29));
        Emps.add(new Employee("Rahul",1005,32));

        System.out.println(Emps);
        Collections.sort(Emps);
        System.out.println(Emps);


    }



}
