// Problem: 1752. Check if Array Is Sorted and Rotated
// Platform: LeetCode
// Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Approach: Count the number of "drops" where nums[i] > nums[i+1]
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution{
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] nums={3,4,5,1,2};
        boolean result=check(nums);
        System.out.println(result);

    }
}