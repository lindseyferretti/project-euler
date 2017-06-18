/**
 * Lindsey Ferretti
 * Project Euler: Problem 6 - Sum square difference
 *
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten
 * natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 */

public class euler006 {

    public static int findDifference() {
        int[] terms = findTerms();
        return terms[0] - terms[1];
    }

    public static int[] findTerms() {
        int i;
        int sum = 0, sumSquares = 0;
        int[] result = new int[2];
        for (i = 1; i <= 100; i++) {
            sum += i;
            sumSquares += i * i;
        }
        result[0] = sum * sum;              // the square of the sum
        result[1] = sumSquares;             // the sum of the squares
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + findDifference());
    }
}