/*
 * Problem: Maximum Subarray
 * Platform: LeetCode
 * Difficulty: Medium
 *
 * Approach:
 * Use Kadane's Algorithm.
 * Keep track of the current subarray sum and the maximum
 * sum found so far. Reset the current sum when it becomes negative.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
