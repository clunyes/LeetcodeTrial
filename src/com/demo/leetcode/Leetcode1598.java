package com.demo.leetcode;

public class Leetcode1598 {
    static String back = "../";
    static String stay = "./";

    public static void main(String[] args) {
        String[] arr = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
        System.out.println(minOperations(arr));
    }

    public static int minOperations(String[] logs) {
        int result = 0;
        for (int i = 0; i < logs.length; i++) {
            String action = logs[i];
            if (action.equals(back)) {
                if (result != 0) {
                    result--;
                }
            } else if (action.equals(stay)) {

            } else {
                result++;
            }
        }
        return result;
    }
}
