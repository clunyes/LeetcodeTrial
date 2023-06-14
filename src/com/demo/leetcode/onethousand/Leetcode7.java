package com.demo.leetcode.onethousand;

public class Leetcode7 {
    public int reverse(int x) {
        // 先取符号
        int op = x > 0 ? 1 : -1;
        x = Math.abs(x);
        String s = new StringBuffer(String.valueOf(x)).reverse().toString();
        String sMax = String.valueOf(Integer.MAX_VALUE);
        int length = sMax.length();
        if (s.length() >= length && s.compareTo(sMax) > 0) {
            return 0;
        }
        return Integer.valueOf(s) * op;
    }
}
