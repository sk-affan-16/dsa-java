/*
 * Problem: Running Sum of 1d Array
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Use a separate array to store the running sum.
 * Each element is calculated using the previous running sum
 * and the current element of the input array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }
}
