package executorService;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeNumberExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you the nth prime number. Enter n:");
            int n = sc.nextInt();
            if(n==0) break;
        }
    }
}
