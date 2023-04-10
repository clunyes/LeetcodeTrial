package com.demo.leetcode.twothousand;

public class Leetcode1895 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArray = s.split(" ");
        String[] temp = new String[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            String cur = sArray[i];
            int index = Integer.parseInt(cur.substring(cur.length() - 1, cur.length()));
            String content = cur.substring(0, cur.length() - 1);
            temp[index - 1] = content;
        }
        for (int i = 0; i < sArray.length; i++) {
            sb.append(temp[i]);
            if (i != sArray.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
