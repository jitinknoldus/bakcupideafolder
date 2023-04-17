package Comparator_Practice;

public class Employee implements Comparable<Employee>{
    String name;
    int id;
    int age;


    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.id>employee.id){
            return 1;
        } else if (this.id< employee.id) {
            return -1;
        }else {
            return 0;
        }
    }
}
