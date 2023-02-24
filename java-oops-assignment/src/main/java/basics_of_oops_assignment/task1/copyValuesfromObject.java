package basics_of_oops_assignment.task1;

//functionality to copy values of one object to another

import java.util.Scanner;

class Car{
    String name;
    String type;
    int number;

    Car(String name, String type, int number){
        this.name = name;
        this.type = type;
        this.number = number;
    }

    void print(){
        System.out.println("Name of car is: " + name);
        System.out.println("Type of car is: " + type);
        System.out.println("Number of car is: " + number + "\n");
    }


}

public class copyValuesfromObject {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter name of car");
        String name = scannerObject.nextLine();

        System.out.println("Enter type of car");
        String type = scannerObject.nextLine();

        System.out.println("Enter number of car");
        int number = scannerObject.nextInt();

        Car object1 = new Car(name,type,number);
        object1.print();

        Car object2 = object1;
        object2.print();

    }
}
