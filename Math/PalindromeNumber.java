/*
 * Problem: Palindrome Number
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Reverse only half of the number and compare it with
 * the remaining half. This avoids converting the number
 * to a string and reduces the risk of integer overflow.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int reversedHalf = 0;

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
