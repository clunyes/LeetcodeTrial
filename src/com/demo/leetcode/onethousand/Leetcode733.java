package com.demo.leetcode.onethousand;

public class Leetcode733 {

    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp = image[sr][sc];
        if (color == temp) {
            return image;
        }
        infect(image, sr, sc, temp, color);

        return image;
    }

    private void infect(int[][] image, int sr, int sc, int temp, int color) {
        if (sr >= 0 && sr >= 0 && sr < image.length && sc < image[0].length) {
            if (temp == image[sr][sc]) {
                image[sr][sc] = color;
                infect(image, sr + 1, sc, temp, color);
                infect(image, sr - 1, sc, temp, color);
                infect(image, sr, sc + 1, temp, color);
                infect(image, sr, sc - 1, temp, color);
            }
        }
    }
}
