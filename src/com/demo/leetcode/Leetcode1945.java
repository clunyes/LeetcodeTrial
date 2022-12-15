package com.demo.leetcode;

import java.math.BigInteger;

public class Leetcode1945 {

    public static void main(String[] args) {
        System.out.println(getLucky("zbax", 2));
        System.out.println(getLucky("iiii", 1));
    }

    public static int getLucky(String s, int k) {
        char[] strArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : strArr) {
            sb.append((c - 'a') + 1);
        }
        String numStr = sb.toString();
        for (int i = 0; i < k; i++) {
            numStr = getSum(numStr);
        }
        return Integer.parseInt(numStr);
    }


    private static String getSum(String str) {
        int sum = 0;
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            sum += Integer.parseInt(String.valueOf(strArr[i]));
        }
        return "" + sum;
    }
}
