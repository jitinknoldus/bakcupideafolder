package reentrantlockexample;


import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockExample implements Runnable {

     ReentrantLock lock = new ReentrantLock();

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
        try{
            lock.lock();
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments " + this.count());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrements " + this.count());
        }finally{
            lock.unlock();
        }
    }

}


public class Main{
    public static void main(String[] args) {

        ReentrantLockExample s1 = new ReentrantLockExample();


        new Thread(s1,"One").start();
        new Thread(s1,"Two").start();
        new Thread(s1,"Three").start();
        new Thread(s1,"Four").start();
        new Thread(s1,"Five").start();

    }
}


