package ConcurrencyJavaBrains.nth_PrimeNumber;

import java.util.Scanner;

public class NthPrimeNumberWithThread {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you the nth prime number. Enter n");
            int n = sc.nextInt();
            if(n==0) break;

            Runnable runnable = new Runnable() {
                @Override
                public void run() {

                   int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("The " +n+ "th prime number is: "+number);
                }
            };

            new Thread(runnable).start();
//            new Thread(runnable).start();
//            new Thread(runnable).start();
        }
    }
}
