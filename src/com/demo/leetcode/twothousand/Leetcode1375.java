package com.demo.leetcode.twothousand;

public class Leetcode1375 {

    public static void main(String[] args) {
        System.out.println(numTimesAllBlue(new int[]{3, 2, 4, 1, 5}));
    }

    public static int numTimesAllBlue(int[] flips) {
        int n = flips.length;
        int ans = 0, right = 0;
        for (int i = 0; i < n; ++i) {
            right = Math.max(right, flips[i]);
            if (right == i + 1) {
                ++ans;
            }
        }
        return ans;
    }
}
