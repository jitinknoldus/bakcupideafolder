package Question9;


public class Shape
{
    public void draw()

    {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape
{
    public void draw()
    {

        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("This is a rectangle");
    }
}

class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("This is a triangle");
    }
}

class DrawingShape
{
    public static void main(String args[])
    {
        Circle circle1 = new Circle();
        circle1.draw();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();
        Triangle triangle1 = new Triangle();
        triangle1.draw();
    }
}