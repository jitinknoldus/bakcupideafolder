package ConcurrencyJavaBrains.nth_PrimeNumber;

public class PrimeNumberUtil {


        public static int calculatePrime(int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Input must be positive");
            }

            int count = 0;
            int candidate = 2;
            while (true) {
                if (isPrime(candidate)) {
                    count++;
                    if (count == n) {
                        return candidate;
                    }
                }
                candidate++;
            }
        }

        private static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
