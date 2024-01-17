package com.demo.leetcode.onethousand;

public class Leetcode125 {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome(" "));
//        System.out.println(isPalindrome("."));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] cA = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cA) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        if (sb.length() == 0) {
            return true;
        }
        String targetString = sb.toString();
        System.out.println("targetString==="+targetString);
        String reverseString = sb.reverse().toString();
        return targetString.equals(reverseString);
    }
}
