// Problem: 1. Two Sum
// Platform: LeetCode
// Link: https://leetcode.com/problems/two-sum/
// Approach:
//   - Use a HashMap to store value → index
//   - For each element, compute: complement = target - nums[i]
//   - If complement exists in map, return indices
//   - Otherwise, store nums[i] in the map
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class TwoSum {
    public static int[] sum(int[] nums, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];

            if(map.containsKey(result)){
                return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int target=8;
        int[] result=sum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
