/**
 * Lindsey Ferretti
 * Project Euler: Problem 7 - 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 */

public class euler007 {

    public static int findPrime(int n) {
        int i;
        int count = 0;
        for (i = 1; count < n; i++) {
            if (isPrime(i)) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        int n;
        if (num % 2 == 0) {
            return false;
        }
        for (n = 3; n < (Math.pow(num, 0.5) + 1); n += 2) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + findPrime(10001));
    }
}