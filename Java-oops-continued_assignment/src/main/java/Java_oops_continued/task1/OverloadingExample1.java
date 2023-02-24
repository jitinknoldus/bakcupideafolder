package Java_oops_continued.task1;

import java.util.Scanner;

public class OverloadingExample1
{
    static int add(int number1, int number2)
    {
        return number1+number2;
    }
    static int add(int number1, int number2, int number3)
    {
        return number1+number2+number3;
    }
    public static void main(String args[])
    {
        int num1, num2, num3;

        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter first number ");
        num1 = takeInput.nextInt();
        System.out.println("Enter second number ");
        num2 = takeInput.nextInt();
        System.out.println("Enter third number ");
        num3 = takeInput.nextInt();
        System.out.println("The result of addition of 2 numbers: "+ OverloadingExample1.add(num1,num2));
        System.out.println("The result of addition of 3 numbers: "+ OverloadingExample1.add(num1,num2,num3));

    }

}
