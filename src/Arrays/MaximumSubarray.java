// Problem: 53. Maximum Subarray
// Platform: LeetCode
// Link: https://leetcode.com/problems/maximum-subarray/
// Approach: Kadane's Algorithm
//   - Maintain two values:
//       * currentSum → best subarray ending at current index
//       * maxSum → best subarray found so far
//   - For each element:
//       currentSum = max(nums[i], currentSum + nums[i])
//       maxSum = max(maxSum, currentSum)
//   - Efficient and works in a single pass
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], nums[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));  
    }
}
