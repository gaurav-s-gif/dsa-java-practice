// Problem: 31. Next Permutation
// Platform: LeetCode
// Link: https://leetcode.com/problems/next-permutation/
// Approach:
//   - Traverse from right to find the first index i such that nums[i] < nums[i + 1]
//   - From the right, find index j such that nums[j] > nums[i]
//   - Swap nums[i] and nums[j]
//   - Reverse the subarray from index i + 1 to the end
//   - If no such index i exists, reverse the entire array
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class NextPermutation {

    public static void nextP(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // 1. Find breakpoint
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. Swap with just larger element
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // 3. Reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // For local testing only
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 5, 3, 1};
        nextP(nums);
        System.out.println(Arrays.toString(nums));
    }
}
