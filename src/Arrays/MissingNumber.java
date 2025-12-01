// Problem: 268. Missing Number
// Platform: LeetCode
// Link: https://leetcode.com/problems/missing-number/
// Approach:
//   - Use the sum formula for the first n natural numbers: n * (n + 1) / 2
//   - Compute the actual sum of the array
//   - The missing number = expected_sum - actual_sum
//   - Runs in O(n) time and O(1) extra space
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = missingNumber(nums);
        System.out.println(result);  // Output: 2
    }
}
