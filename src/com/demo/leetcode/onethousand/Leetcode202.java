package com.demo.leetcode.onethousand;

import java.util.HashSet;

public class Leetcode202 {
    static HashSet set = new HashSet();

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        if (set.contains(n) && n != 1) {
            return false;
        }
        set.add(n);
        int res = 0;
        String nums = "" + n;
        for (int i = 0; i < nums.length(); i++) {
            int num = nums.charAt(i) - '0';
            res += num * num;
        }
        if (res == 1) {
            return true;
        } else {
            return isHappy(res);
        }
    }


}
