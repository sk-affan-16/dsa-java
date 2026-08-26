/*
 * Problem: Search Insert Position
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Traverse the sorted array and return the first position
 * where the target can be inserted without breaking the order.
 * If the target is greater than every element, return nums.length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }

        return nums.length;
    }
}
