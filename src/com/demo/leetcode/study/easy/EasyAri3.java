package com.demo.leetcode.study.easy;

import java.util.Arrays;

public class EasyAri3 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rightpart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(rightpart, 0, nums, 0, k);
    }

}
