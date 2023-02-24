package ConcurrencyJavaBrains.DaemonThread;

import ConcurrencyJavaBrains.nth_PrimeNumber.PrimeNumberUtil;

import java.util.Scanner;

public class DaemonThread {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you the nth prime number. Enter n");
            int n = sc.nextInt();
            if (n == 0) break;

            Runnable runnable = new Runnable() {
                @Override
                public void run() {

                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("The " + n + "th prime number is: " + number);
                }
            };

                Thread thread1 = new Thread(runnable);
                thread1.setDaemon(true);
                thread1.start();
//                Thread thread2 = new Thread(runnable);
//                thread2.setDaemon(true);
//                thread2.start();
        }
    }
}
