package com.demo.leetcode.twothousand;

public class Leetcode1422 {

    public static void main(String[] args) {
//        System.out.println(maxScore("00111"));
        System.out.println(maxScore2("011101"));
//        System.out.println(maxScore2("1111"));
    }

    public static int maxScore(String s) {
        int maxScore = 0;
        for (int i = 1; i < s.length(); i++) {
            int score = 0;
            CharSequence leftCs = s.subSequence(0, i);
            CharSequence rightCs = s.subSequence(i, s.length());
            for (int j = 0; j < leftCs.length(); j++) {
                if (leftCs.charAt(j) == '0') {
                    score++;
                }
            }
            for (int j = 0; j < rightCs.length(); j++) {
                if (rightCs.charAt(j) == '1') {
                    score++;
                }
            }
            maxScore = maxScore > score ? maxScore : score;
        }
        return maxScore;
    }

    public static int maxScore2(String s) {
        int n = s.length(), ans = 0;
        int[] sum = new int[n + 10];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + (s.charAt(i - 1) - '0');
        }
        for (int i = 1; i <= n - 1; i++) {
            int a = i - sum[i], b = sum[n] - sum[i];
            ans = Math.max(ans, a + b);
        }
        return ans;
    }

}
