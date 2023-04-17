package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };

        executor.execute(runnable);
    }
}
