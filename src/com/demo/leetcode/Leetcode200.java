package com.demo.leetcode;

public class Leetcode200 {
    public static void main(String[] args) {

    }

    public int numIslands(char[][] grid) {
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ('1' == grid[i][j]) {
                    num++;
                    infect(grid, i, j, '1', '2');
                }
            }
        }
        return num;
    }

    private void infect(char[][] grid, int row, int col, char temp, char target) {
        if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length) {
            if (temp == grid[row][col]) {
                grid[row][col] = target;
                infect(grid, row + 1, col, temp, target);
                infect(grid, row - 1, col, temp, target);
                infect(grid, row, col + 1, temp, target);
                infect(grid, row, col - 1, temp, target);
            }
        }
    }
}
