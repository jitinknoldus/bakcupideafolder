package HashMapImplementation;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1001);
        employee1.setName("Jitin");

        Employee employee2 = new Employee();
        employee2.setId(1001);
        employee2.setName("Jitin");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

    }
}
