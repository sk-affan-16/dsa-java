/*
 * Problem: Rotate Array
 * Platform: LeetCode
 * Difficulty: Medium
 *
 * Approach:
 * Create a temporary array and place each element at its
 * rotated position using (i + k) % n. Copy the result back
 * into the original array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}
