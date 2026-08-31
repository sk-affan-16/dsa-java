import java.util.HashSet;
import java.util.Set;

/*
 * Problem: Contains Duplicate
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Use a HashSet to store each number.
 * If a number already exists in the set, a duplicate is found.
 *
 * Time Complexity: O(n) on average
 * Space Complexity: O(n)
 */

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
