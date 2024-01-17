package com.demo.leetcode.onethousand;

import java.util.HashMap;

public class Leetcode1 {

    public static void main(String[] args) {
        twoSum(new int[]{-3, 4, 3, 90}, 0);
//        twoSum(new int[]{3, 2, 3}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 2) {
            return new int[]{0, 1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(target - num)) {
                map.put(num, i);
            } else {
                result[0] = i;
                result[1] = map.get(target - num);
            }
        }
        return result;
    }
}
