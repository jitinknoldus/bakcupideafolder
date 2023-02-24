package ConcurrencyJavaBrains.nth_PrimeNumber;
import java.util.*;

import java.util.Scanner;

public class NthPrimeNumber {

    public static void main(String[] args) {
        int number;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you the nth prime number. Enter n");
            int n = sc.nextInt();

            if(n==0)break;
             number = PrimeNumberUtil.calculatePrime(n);
            System.out.println("\n The value of " +  n + "th prime number is :" + number);

        }
    }
}
