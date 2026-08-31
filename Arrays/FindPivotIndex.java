/*
 * Problem: Find Pivot Index
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Calculate the total sum of the array.
 * Maintain the sum of elements to the left of each index.
 * The right sum can be calculated as:
 * totalSum - nums[i] - leftSum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - nums[i] - leftSum;

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
