package com.demo.leetcode.threethousand;

import java.util.Arrays;

public class Leetcode2611 {

    public static void main(String[] args) {
//        System.out.println(miceAndCheese(new int[]{1,1},new int[]{1,1},2));
        System.out.println(miceAndCheese(new int[]{2, 1}, new int[]{1, 2}, 1));
//        System.out.println(miceAndCheese(new int[]{1,1,3,4},new int[]{4,4,1,1},2));
    }

    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0;
        int n = reward1.length;
        for (int i = 0; i < n; ++i) {
            ans += reward2[i];
            reward1[i] -= reward2[i];
        }
        Arrays.sort(reward1);
        for (int i = 0; i < k; ++i) {
            ans += reward1[n - i - 1];
        }
        return ans;

    }

}
