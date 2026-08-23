import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Store each number with its index in a HashMap.
 * For every number, check whether its complement
 * (target - current number) has already been seen.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
