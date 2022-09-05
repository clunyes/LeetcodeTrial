package com.demo.leetcode.onethousand;

public class Leetcode424 {
    public static void main(String[] args) {

    }

    public int characterReplacement(String s, int k) {
        /**
         * 不会
         */
        int[] num = new int[26];
        int n = s.length();
        int maxn = 0;
        int left = 0, right = 0;
        while (right < n) {
            num[s.charAt(right) - 'A']++;
            maxn = Math.max(maxn, num[s.charAt(right) - 'A']);
            if (right - left + 1 - maxn > k) {
                num[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}
