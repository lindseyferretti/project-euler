/**
 * Lindsey Ferretti
 * Project Euler: Problem 4 - Largest palindrome product
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class euler004 {

    public static int largestPalindrome() {
        int pal = 0;
        int larPal = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                pal = i * j;
                if (isPalindrome(pal) && (pal > larPal)) {
                    larPal = pal;
                }
            }
        }
        return larPal;
    }

    public static boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        return num.equals(new StringBuffer(num).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println("Result: " + largestPalindrome());
    }
}