package ConcurrencyJavaBrains.ThreadStates;

import java.util.List;

public class ThreadStates {
    public static void printThreads(List<Thread> threads) {
        System.out.println("\n Thread Status: ");
        threads.forEach(thread -> {
            System.out.println(thread.getState() + " ");
        });


        Runnable statusReport = ()->{
          while (true){
              System.out.println(threads);
          }
        };

    }
}
