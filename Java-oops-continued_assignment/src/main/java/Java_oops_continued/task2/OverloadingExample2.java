package Java_oops_continued.task2;

import java.util.Scanner;

public class OverloadingExample2
{
    static void print(int userInput)
            
    {
        System.out.println(" printing a number "+userInput);
    }
    static void print(String textInput)
            
    {
        System.out.println(" printing  String "+textInput);
    }
    public static void main(String args[])
    {
        int userInput;
        String textInput;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a userInput");
        userInput = takeInput.nextInt();
        System.out.println("Enter a string");
        textInput = takeInput.nextLine();
        textInput = takeInput.nextLine();
        OverloadingExample2.print(userInput);
        OverloadingExample2.print(textInput);
    }
}
