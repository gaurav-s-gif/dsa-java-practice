// Problem: 118. Pascal's Triangle
// Platform: LeetCode
// Link: https://leetcode.com/problems/pascals-triangle/
//
// Approach (Dynamic Programming):
// - Use a List of Lists to store all rows of Pascal's Triangle
// - Each row has (i + 1) elements
// - The first and last elements of every row are always 1
// - Middle elements are computed using the formula:
//     triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
//
// Key Insight:
// Each value in Pascal's Triangle depends only on the two values
// directly above it from the previous row
//
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Outer loop for each row
        for (int i = 0; i < numRows; i++) {

            // Initialize row with all 1s
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            // Compute middle elements
            for (int j = 1; j < i; j++) {
                row.set(j,
                        triangle.get(i - 1).get(j - 1) +
                        triangle.get(i - 1).get(j));
            }

            // Add current row to triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
