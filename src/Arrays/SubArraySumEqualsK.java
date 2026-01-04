// Problem: 560. Subarray Sum Equals K
// Platform: LeetCode
// Link: https://leetcode.com/problems/subarray-sum-equals-k/
//
// Approach (Prefix Sum + HashMap):
// - Use a running prefix sum while traversing the array
// - Store frequencies of prefix sums in a HashMap
// - For each index, check if (prefixSum - k) exists in the map
// - If it exists, add its frequency to the count
// - Update the frequency of the current prefix sum
//
// Key Insight:
// If prefixSum - k has appeared before, then a subarray ending
// at the current index has sum equal to k
//
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class SubArraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 occurs once
        map.put(0, 1);

        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];

            int remove = prefixSum - k;

            if (map.containsKey(remove)) {
                count += map.get(remove);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println(result);
    }
}
