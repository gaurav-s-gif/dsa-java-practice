// Problem: 31. Next Permutation
// Platform: LeetCode
// Link: https://leetcode.com/problems/next-permutation/
// Approach:
//   - Traverse from right to find the first index i such that nums[i] < nums[i + 1]
//   - From the right again, find index j such that nums[j] > nums[i]
//   - Swap nums[i] and nums[j]
//   - Reverse the subarray from index i + 1 to the end
//   - If no such index i exists, reverse the entire array
// Time Complexity: O(n)
// Space Complexity: O(1)

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
