// Problem: 48. Rotate Image
// Platform: LeetCode
// Link: https://leetcode.com/problems/rotate-image/
//
// Approach (In-place, O(1) extra space):
// Step 1: Transpose the matrix (swap across main diagonal)
// Step 2: Reverse each row to get 90° clockwise rotation
//
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.Arrays;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
