package Java_oops_continued.task3;

class Animal
{
    void speak()
    {
        System.out.println("The animal speaks ");
    }
}
class Dog extends Animal
{
    public void speak()
    {

        System.out.println("The dog barks");
    }
}
class Cat extends Animal
{
    public void speak()
    {
        System.out.println("Thr cat makes the meow sound");
    }
}

public class OverridingExample1
{
    public static void main(String args[])
    {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.speak();
        cat1.speak();
    }
}