/*
 * Problem: Richest Customer Wealth
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Calculate the total wealth of each customer and keep track
 * of the maximum wealth found so far.
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(1)
 */

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            for (int j = 0; j < accounts[0].length; j++) {
                currentWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
