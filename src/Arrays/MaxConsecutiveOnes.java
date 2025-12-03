// Problem: 485. Max Consecutive Ones
// Platform: LeetCode
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Approach:
//   - Traverse the array and count consecutive 1s
//   - Reset the counter to 0 when a 0 is encountered
//   - Track the maximum streak using a variable 'result'
//   - Simple linear scan approach
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MaxConsecutiveOnes {
    public static int maxOnes(int[] nums){
        int count=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(count>result){
                result=count;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={1,0,0,1,1,1,0,1,1};
        int result=maxOnes(nums);
        System.out.println(result);
    }
}
