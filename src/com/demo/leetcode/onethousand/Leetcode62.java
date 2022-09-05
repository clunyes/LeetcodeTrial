package com.demo.leetcode.onethousand;

public class Leetcode62 {
    static int[][] dp;

    public static void main(String[] args) {
        System.out.println(uniquePaths(5, 3));
    }

    public static int uniquePaths(int m, int n) {
        dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return process(0, 0, m, n);
    }

    private static int process(int row, int column, int m, int n) {
        if (dp[row][column] != -1) {
            return dp[row][column];
        }
        if (row > n - 1 || column > m - 1) {
            dp[row][column] = 0;
            return dp[row][column];
        }
        if (row == n - 1 && column == m - 1) {
            dp[row][column] = 1;
            return dp[row][column];
        }
        dp[row][column] = process(row + 1, column, m, n) + process(row, column + 1, m, n);
        return dp[row][column];
    }
}
