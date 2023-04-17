package executorService;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> callable = new Callable<String>(){

            @Override
            public String call() throws Exception{
                return "Hello";
            }
        };

        Future<String> future = executor.submit(callable);
        String futureResult = future.get();
        System.out.println(futureResult);
    }
}
