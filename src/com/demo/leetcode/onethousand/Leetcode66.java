package com.demo.leetcode.onethousand;

import java.math.BigInteger;
import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }

    public static int[] plusOne(int[] digits) {
        boolean upBit = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            upBit = false;
            int d = digits[i];
            if (d == 9) {
                upBit = true;
                digits[i] = 0;
            } else {
                digits[i] = d + 1;
                break;
            }
        }
        if (upBit) {
            int[] newD = new int[digits.length + 1];
            for (int i = 0; i < newD.length; i++) {
                if (i == 0) {
                    newD[i] = 1;
                } else {
                    newD[i] = digits[i - 1];
                }
            }
            return newD;
        }
        return digits;

    }
}
