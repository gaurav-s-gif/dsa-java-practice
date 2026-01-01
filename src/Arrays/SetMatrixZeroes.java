// Problem: 73. Set Matrix Zeroes
// Platform: LeetCode
// Link: https://leetcode.com/problems/set-matrix-zeroes/
// Approach (Optimal – O(1) extra space):
//   - Use the first row and first column as markers
//   - If matrix[i][j] == 0, mark its row and column by setting
//     matrix[i][0] = 0 and matrix[0][j] = 0
//   - Use two extra flags to track whether first row or first column
//     originally contained a zero
//   - Update the matrix based on markers
//
// Time Complexity: O(m * n)
// Space Complexity: O(1)

import java.util.Arrays;
public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 2: Check first row
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 3: Use first row & column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: Set zeroes using markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Update first column if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        // Step 6: Update first row if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(nums);
        System.out.println(Arrays.deepToString(nums));
    }
}
