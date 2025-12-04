// Problem: 169. Majority Element
// Platform: LeetCode
// Link: https://leetcode.com/problems/majority-element/
// Approach: Moore's Voting Algorithm
//   - Maintain a max and a counter
//   - If counter is 0 → choose current number as max
//   - If current number == max → increment counter
//   - Else → decrement counter
//   - Since majority element appears > n/2 times, it becomes the max
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MajorityElement {

    public static int majority(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                max = nums[i];
            }
            if (nums[i] == max) {
                count++;
            } else {
                count--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,0,3,2,3,2,2,1,3,2,2};
        int result = majority(nums);
        System.out.println(result);  
    }
}
