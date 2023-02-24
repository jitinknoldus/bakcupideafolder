package Java_oops_continued.task4;

//the program is demonstrating method overriding
class Shape
{
    void area()
    {
        int area = 0;
        System.out.println("The area of shape is: "+area);
    }
}
class Circle extends Shape
{
    void area()
    {
        int radius=2;
        System.out.println("The area of circle is: "+ 3.14*radius*radius);
    }
}
class Rectangle extends Shape
{
    void area()
    {
        int length=4;
        int breadth=2;
        System.out.println("The area of rectangle is: "+length*breadth);
    }
}
public class OverridingExample2
{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        circle1.area();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.area();
    }
}
