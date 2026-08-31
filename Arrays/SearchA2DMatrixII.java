/*
 * Problem: Search a 2D Matrix II
 * Platform: LeetCode
 * Difficulty: Medium
 *
 * Approach:
 * Start from the top-right corner of the matrix.
 * If the current value is greater than the target, move left.
 * If the current value is smaller than the target, move down.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                return true;
            } else if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }

        return false;
    }
}
