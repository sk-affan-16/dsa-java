/*
 * Problem: Remove Element
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Traverse the array and overwrite each element that is
 * not equal to val at the next available position.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}
