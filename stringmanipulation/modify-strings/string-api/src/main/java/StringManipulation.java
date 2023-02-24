// This class contains 2 methods to perform actions on strings
public class StringManipulation {

    // function to find the length of the string
    public int lengthOfString(String userInput){
        userInput = userInput+'\0';

        char[] characterArray = userInput.toCharArray();

        int countOfCharacter = 0;

        while(characterArray[countOfCharacter]!='\0'){
            countOfCharacter += 1;
        }

        return countOfCharacter;
    }

    //function to reverse the string
    public String reverseString(String userInput){
        int lengthOfString = lengthOfString(userInput);

        String modifiedString = "";

        for(int index= lengthOfString-1; index>=0; index--){
            Character currentCharacter = userInput.charAt(index);
            modifiedString = modifiedString + currentCharacter;
        }

        return modifiedString;
    }
}
