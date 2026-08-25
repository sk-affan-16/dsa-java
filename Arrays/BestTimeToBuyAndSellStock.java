/*
 * Problem: Best Time to Buy and Sell Stock
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Track the lowest buying price seen so far.
 * For each price, calculate the profit if the stock is sold
 * on that day and keep track of the maximum profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
