package com.demo.leetcode;

import java.util.HashMap;

public class Leetcode1374 {

    public static String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                stringBuilder.append("i");
            }
        } else {
            for (int i = 0; i < n-1; i++) {
                stringBuilder.append("i");
            }
            stringBuilder.append("p");
        }
        return stringBuilder.toString();

    }


    public static void main(String[] args) {
        System.out.println(generateTheString(95));
    }
}
