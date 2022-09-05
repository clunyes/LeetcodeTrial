package com.demo.leetcode.onethousand;

public class Leetcode509 {
    static int[] dp = new int[31];

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if (dp[1] == 0) {
            dp[1] = 1;
        }
        if (n < 2) {
            return dp[n];
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n >= 2) {
            dp[n] = fib(n-1) + fib(n-2);

        }
        return dp[n];
    }
}
