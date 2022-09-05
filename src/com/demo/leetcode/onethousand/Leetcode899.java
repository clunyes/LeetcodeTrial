package com.demo.leetcode.onethousand;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Leetcode899 {

    private static HashSet<String> set;

    public static String orderlyQueue(String s, int k) {
        if (k == 1) {
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            int n = s.length();
            for (int i = 1; i < n; i++) {
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                if (sb.toString().compareTo(smallest) < 0) {
                    smallest = sb.toString();
                }
            }
            return smallest;
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }

    }


    public static void main(String[] args) {
//        System.out.println(orderlyQueue("cba", 1));
        //"mqvgtdfuiv"
        //10
//        System.out.println(orderlyQueue("mqvgtdfuiv", 10));
//        System.out.println(orderlyQueue("baaca", 3));
//        System.out.println(orderlyQueue("kuh", 1));
        System.out.println(orderlyQueue("gggabbsacscasewqe", 2));
    }
}
