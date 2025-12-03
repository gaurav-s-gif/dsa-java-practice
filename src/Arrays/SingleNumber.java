// Problem: 136. Single Number
// Platform: LeetCode
// Link: https://leetcode.com/problems/single-number/
// Approach:
//   - Use XOR to find the unique element
//   - XOR properties:
//       * x ^ x = 0
//       * x ^ 0 = x
//   - XORing all elements cancels out duplicates, leaving the single number
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SingleNumber {

    public static int single(int[] nums) {
        int xor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = single(nums);
        System.out.println(result);  // Output: 4
    }
}
