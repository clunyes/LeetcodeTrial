package com.demo.leetcode.onethousand;

public class Leetcode70 {
    int[] dp = new int[46];

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n == 1) {
            dp[n] = 1;
        } else if (n == 2) {
            dp[n] = 2;
        } else {
            dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return dp[n];
    }
}
