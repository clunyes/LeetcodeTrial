package com.demo.leetcode.onethousand;

import java.util.Arrays;

public class Leetcode344 {

    public static void main(String[] args) {
        char[] c = new char[]{'h','e','l','l','o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }

    public static void reverseString(char[] s) {
        char temp = ' ';
        for (int i = 0; i < s.length / 2; i++) {
            temp  = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
