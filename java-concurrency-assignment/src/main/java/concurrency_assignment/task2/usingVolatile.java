package concurrency_assignment.task2;

// performing threads operation using volatile variable

public class usingVolatile {

     private static volatile int counter = 0;

    public static void main(String[] args) {


        //creating Thread 1 for displaying changed value
        Thread displayChange = new Thread(()->{

            int local_counter = counter;
            while(local_counter<10){
                if(local_counter!=counter){
                    System.out.println("[Thread:1] is changed");
                }

                local_counter = counter;

                //handling error
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });



        //creating Thread 2 for incrementing values
        Thread incrementThread = new Thread(()->{

            int local_counter = counter;
            while(local_counter<10){
                System.out.println("Thread incremented to: " + (local_counter+1));
                counter = ++local_counter;
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }

            }
        });


        displayChange.start();
        incrementThread.start();




    }
}