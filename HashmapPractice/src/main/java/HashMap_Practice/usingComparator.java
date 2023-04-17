package HashMap_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable <Employee> {
    String name;
    double salary;
    int id;

    Employee(String name, int id){
        this.id = id;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Employee other) {

            return name.compareTo(other.getName());

    }


}




 public class usingComparator {
     public static void main(String[] args) {
         ArrayList<Employee> list = new ArrayList<>();
         Employee e1 = new Employee("jitin",  1);
         Employee e2 = new Employee("salil",  1);
         Employee e3 = new Employee("jassi",  3);
         list.add(e1);
         list.add(e2);
         list.add(e3);
         Collections.sort(list);

         for (Employee emp : list) {

             System.out.println(emp.name + " " + emp.salary + " " + emp.id);
         }
     }
 }
