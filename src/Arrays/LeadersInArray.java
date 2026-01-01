// Problem: Leaders in an Array
// Platform: GeeksforGeeks
// Link: https://www.geeksforgeeks.org/leaders-in-an-array/
// Approach:
//   - Traverse the array from right to left
//   - Keep track of the maximum element seen so far
//   - If the current element is greater than the max, it is a leader
//   - Store leaders in an ArrayList
//   - Reverse the ArrayList using a custom reverse method to maintain order
//   - Runs in linear time
//
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;

public class LeadersInArray {

    public static ArrayList<Integer> result(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();

        int maxFromRight = nums[nums.length - 1];
        leaders.add(maxFromRight);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }

        reverse(leaders);
        return leaders;
    }

    public static void reverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 2, 0, 6};
        System.out.println(result(nums));
    }
}
