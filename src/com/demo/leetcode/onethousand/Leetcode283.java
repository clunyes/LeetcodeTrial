package com.demo.leetcode.onethousand;

import java.util.Arrays;

public class Leetcode283 {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});

    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] == 0) {
                    if (index + 1 <= nums.length - 1) {
                        int temp = nums[index];
                        nums[index] = nums[index + 1];
                        nums[index + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
