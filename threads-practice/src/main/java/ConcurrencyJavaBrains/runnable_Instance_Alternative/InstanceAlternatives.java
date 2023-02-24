package ConcurrencyJavaBrains.runnable_Instance_Alternative;

public class InstanceAlternatives {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=10; i++){
                    System.out.println("2*" + i + " is " + 2*i);
                }
            }
        };


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=10; i++){
                    System.out.println("3*" + i + " is " + 3*i);
                }
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
