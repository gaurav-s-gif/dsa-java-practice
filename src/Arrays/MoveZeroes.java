// Problem: 283. Move Zeroes
// Platform: LeetCode
// Link: https://leetcode.com/problems/move-zeroes/
// Approach:
//   - Use two pointers (i and j)
//   - Pointer i scans the array
//   - Pointer j tracks the position for the next non-zero element
//   - First pass: move all non-zero elements to the front
//   - Second pass: fill remaining positions with zero
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the rest with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // [1, 3, 12, 0, 0]
    }
}
