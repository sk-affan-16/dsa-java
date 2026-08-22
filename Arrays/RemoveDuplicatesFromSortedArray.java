/*
 * Problem: Remove Duplicates from Sorted Array
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Use the sorted order of the array and maintain a pointer
 * to the position where the next unique element should be placed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
