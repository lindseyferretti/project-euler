/**
 * Lindsey Ferretti
 * Project Euler: Problem 3 - Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class euler003 {

    public static long largestPrime(long num){
        int factor = 2;
        long largest = 0;
        while (num != 1) {
            if (num % factor == 0) {
                num /= factor;
                largest = factor;
            }
            factor++;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + largestPrime(600851475143L));       // prints largest factor
    }
}
