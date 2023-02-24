package ConcurrencyJavaBrains.thread_intro;


class RunnableExample1 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("2*" + i + " is " + 2*i);
        }
    }
};

class RunnableExample2 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("3*" + i + " is " + 3*i);
        }
    }
};




public class ImplementingRunnable  {
    public static void main(String[] args) {
        Runnable runnable1 = new RunnableExample1();
//        Thread thread1 = new Thread(runnable1);

        Runnable runnable2 = new RunnableExample2();
//        Thread thread2 = new Thread(runnable2);
//        thread1.start();
//        thread2.start();

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
