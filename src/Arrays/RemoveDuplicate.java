// Problem: 26. Remove Duplicates from Sorted Array
// Platform: LeetCode
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: 
//   - Use two pointers (i and j)
//   - Pointer i scans the array
//   - Pointer j tracks the position to place the next unique element
//   - Whenever nums[i] != nums[i-1], copy nums[i] to nums[j] and increment j
// Result: First 'j' elements are the unique values
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicate {

    public static int removeDuplicate(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 3, 4, 4, 5};
        int result = removeDuplicate(nums);
        System.out.println(result);
    }
}
