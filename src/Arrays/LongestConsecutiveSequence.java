// Problem: 128. Longest Consecutive Sequence
// Platform: LeetCode
// Approach:
//   1. Put all numbers into a HashSet
//   2. Only start counting when a number has no previous number (num - 1)
//   3. Count forward until the sequence breaks
//   4. Keep track of the maximum length
//
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
