import java.util.Scanner;

//main class that will handle all the operations of user
public class Main {

    public static void main(String args[]){

        // creating object of string manipulation class
        StringManipulation object = new StringManipulation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String userInput = sc.nextLine();

        System.out.println("Press 1: To reverse a string");
        System.out.println("Press 2: To find length of a string");
        int actionToPerform = sc.nextInt();

        //taking user input for action to be performed
        switch(actionToPerform){
            case 1: System.out.println(object.reverseString(userInput));
            break;
            case 2: System.out.println(object.lengthOfString(userInput));
            break;
            default:System.out.println("Please select a valid action to be perform");
        }
    }
}
