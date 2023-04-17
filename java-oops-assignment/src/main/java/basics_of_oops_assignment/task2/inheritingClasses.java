package basics_of_oops_assignment.task2;

// functionality to display hierarchical inheritance

import java.util.Scanner;

class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary,String specialization){
        super(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
    }

}

class Manager extends Member{
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department){
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }
}





public class inheritingClasses {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 22, "99907890", "Noida", 29000, "Java");
        Manager manager = new Manager("Jack", 23, "9456878521", "Noida", 400500, "Scala");
        employee.printSalary();
        manager.printSalary();
    }
}
