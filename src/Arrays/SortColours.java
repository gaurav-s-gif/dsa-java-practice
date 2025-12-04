// Problem: 75. Sort Colors
// Platform: LeetCode
// Link: https://leetcode.com/problems/sort-colors/
// Approach: Dutch National Flag Algorithm
//   - Use three pointers: low, mid, high
//   - low: tracks the position for 0s
//   - mid: current index being inspected
//   - high: tracks the position for 2s
//   - Logic:
//       * nums[mid] == 0 → swap with low, increment low & mid
//       * nums[mid] == 1 → just move mid
//       * nums[mid] == 2 → swap with high, decrement high
//   - Single pass → O(n) time, O(1) space
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class SortColours {

    public static void sorted(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 2, 1, 1, 1, 0, 2, 1, 1, 2};
        sorted(nums);
        System.out.println(Arrays.toString(nums));
    }
}
