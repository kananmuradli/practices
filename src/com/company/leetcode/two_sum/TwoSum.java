package com.company.leetcode.two_sum;

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]

//    Input: nums = [3,3], target = 6
//    Output: [0,1]

//    Constraints:
//
//    2 <= nums.length <= 104
//    -109 <= nums[i] <= 109
//    -109 <= target <= 109
//    Only one valid answer exists.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
        return result;
      }
      map.put(nums[i], i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {2, 11, 7, 15};
    int target = 26;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}