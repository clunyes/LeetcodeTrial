package com.demo.leetcode;

public class Leetcode1413 {

    public static void main(String[] args) {
//        int[] arr = new int[]{-3, 2, -3, 4, 2};
        int[] arr = new int[]{1,2};
        System.out.println(minStartValue(arr));
    }

    public static int minStartValue(int[] nums) {
        int min = 0;
        int result = 1;
        int sum = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, sum);
        }
        result = (1 - min) > 1 ? 1 - min : 1;
        return result;
    }
}
