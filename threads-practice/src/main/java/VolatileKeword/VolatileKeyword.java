package VolatileKeword;


public class VolatileKeyword {

    private static volatile int counter = 0;

    public static void main(String[] args)  {

        Thread t1 = new Thread(()->{
            int local_Counter = counter;

            while(local_Counter < 10){
                if(local_Counter != counter){
                    System.out.println("Thread is changed");
                    local_Counter=counter;
                }
            }
        });

        Thread t2 = new Thread(()->{
            int local_counter = counter;

            while (local_counter < 10) {
                System.out.println("Thread two incremented to " + (local_counter + 1));
                counter = ++local_counter;


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
