// Problem: 189. Rotate Array
// Platform: LeetCode
// Link: https://leetcode.com/problems/rotate-array/
// Approach:
//   - Use the reverse technique to rotate the array in-place
//   - Steps for rotating right by k positions:
//       1) Normalize k: k = k % n
//       2) Reverse the entire array
//       3) Reverse the first k elements
//       4) Reverse the remaining elements from index k to n-1
//   - This effectively shifts each element to its correct rotated position.
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class Solution {

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Important for cases where k > n

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);

        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
