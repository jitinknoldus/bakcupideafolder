package concurrency_assignment;


import java.util.Scanner;

class SynchronizationMethod implements Runnable {
      int count = 0;
    public int increment(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        return count++;
    }

    public int decrement(){
        return count--;
    }

    public int count(){
        return count;
    }



        @Override
        public void run() {
            synchronized (this){
                this.increment();
                System.out.println(Thread.currentThread().getName() + " increments " + this.count());
                this.decrement();
                System.out.println(Thread.currentThread().getName() + " decrements " + this.count());
            }
        }

}


public class Main {
    public static void main(String[] args) {

        SynchronizationMethod s1 = new SynchronizationMethod();


        new Thread(s1,"One").start();
        new Thread(s1,"Two").start();
        new Thread(s1,"Three").start();
        new Thread(s1,"Four").start();
        new Thread(s1,"Five").start();

    }
}


