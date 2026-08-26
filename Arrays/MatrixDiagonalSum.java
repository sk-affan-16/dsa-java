/*
 * Problem: Matrix Diagonal Sum
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Traverse both the primary and secondary diagonals in one pass.
 * The condition prevents the center element from being counted twice
 * when the matrix has an odd number of rows.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            // Primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }
}
