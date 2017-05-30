/**
 * Lindsey Ferretti
 * Project Euler: Problem 1 - Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class euler001 {

    public static int sumOfMultiples() {
        int i;
        int sum = 0;
        for (i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {     // if i is divisible by three or five
                sum += i;                       // add i to the sum
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + sumOfMultiples());      // prints the sum
    }
}
