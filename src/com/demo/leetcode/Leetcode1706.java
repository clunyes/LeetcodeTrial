package com.demo.leetcode;

public class Leetcode1706 {

    public static void main(String[] args) {
//        int[][] grid = new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}};
        int[][] grid = new int[][]{{-1}};
        findBall(grid);
    }

    public static int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i] = findOneBall(grid, i, 0);
        }
        return res;
    }


    public static int findOneBall(int[][] grid, int pos, int row) {
        if (row == grid.length) {
            return pos;
        }
        if (pos == 0) {
            if (grid[row][pos] == -1) {
                return -1;
            }
        }
        if (pos == grid[row].length - 1) {
            if (grid[row][pos] == 1) {
                return -1;
            }
        }
        if (grid[row][pos] == 1) {
            if (grid[row][pos + 1] == -1) {
                return -1;
            } else {
                row++;
                pos += 1;
                return findOneBall(grid, pos, row);
            }
        } else {
            if (grid[row][pos - 1] == 1) {
                return -1;
            } else {
                row++;
                pos -= 1;
                return findOneBall(grid, pos, row);
            }
        }
    }
}
