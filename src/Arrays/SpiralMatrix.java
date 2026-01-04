// Problem: 54. Spiral Matrix
// Platform: LeetCode
// Link: https://leetcode.com/problems/spiral-matrix/
//
// Approach (Boundary Traversal):
// - Maintain four pointers: top, bottom, left, right
// - Traverse the matrix layer by layer in spiral order:
//   1. Traverse top row from left → right
//   2. Traverse right column from top → bottom
//   3. Traverse bottom row from right → left (if valid)
//   4. Traverse left column from bottom → top (if valid)
// - After each traversal, shrink the corresponding boundary
//
// Time Complexity: O(m * n)
// Space Complexity: O(1) extra space (excluding output list)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Traverse top row
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // Traverse right column
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16 }
        };

        System.out.println(spiralOrder(matrix));
    }
}
