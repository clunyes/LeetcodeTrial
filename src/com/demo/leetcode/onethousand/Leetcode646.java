package com.demo.leetcode.onethousand;

import java.util.Arrays;

public class Leetcode646 {

    public static void main(String[] args) {

    }

    public int findLongestChain(int[][] pairs) {
        //没有做出来
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int ans = 0;

        // 题目隐藏的数据范围是[-1000,1000]，我测出来的
        // 如果数据范围扩充到Integer.MIN_VALUE，则不能使用这个值
        int last = Integer.MIN_VALUE;
        for (int[] p : pairs) {
            if (p[0] > last) {
                ans++;
                last = p[1];
            }
        }

        return ans;
    }
}
