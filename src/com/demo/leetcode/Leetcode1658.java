package com.demo.leetcode;

import java.util.Arrays;

public class Leetcode1658 {

    public static void main(String[] args) {
//        int[] array = new int[]{1, 1, 4, 2, 3};
        int[] array = new int[]{3, 2, 20, 1, 1, 3};
//        int[] array = new int[]{1, 1};
        System.out.println(minOperations(array, 10));
    }

    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();

        if (sum < x) {
            return -1;
        }

        int right = 0;
        int lsum = 0, rsum = sum;
        int ans = n + 1;

        for (int left = -1; left < n; ++left) {
            if (left != -1) {
                lsum += nums[left];
            }
            while (right < n && lsum + rsum > x) {
                rsum -= nums[right];
                ++right;
            }
            if (lsum + rsum == x) {
                ans = Math.min(ans, (left + 1) + (n - right));
            }
        }

        return ans > n ? -1 : ans;
    }

}
