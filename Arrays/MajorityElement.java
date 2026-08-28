/*
 * Problem: Majority Element
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Use the Boyer-Moore Voting Algorithm.
 * Maintain a candidate and a count. Different elements cancel
 * each other out, leaving the majority element as the candidate.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
