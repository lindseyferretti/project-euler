/**
 * Lindsey Ferretti
 * Project Euler: Problem 5 - Smallest multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class euler005 {

    public static int smallestMult() {
        int i;
        for (i = 2520; i < 999999999; i+=20) {
            if (divisionCheck(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean divisionCheck(int num) {
        int i;
        int[] check = new int[] {11, 13, 14, 16, 17, 18, 19, 20};
        for (i = 0; i < check.length; i++) {
            if (num % check[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + smallestMult());
    }
}