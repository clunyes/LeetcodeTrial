package com.demo.leetcode.onethousand;

import java.util.Arrays;

public class Leetcode58 {

    public static int lengthOfLastWord(String s) {
        int posNextChar = 0;
        int posBeforeNoChar = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (i + 1 < s.length() && s.charAt(i + 1) != ' ') {//下一位不为空格
                    posNextChar = i + 1;
                    if(posNextChar>posBeforeNoChar){
                        posBeforeNoChar = s.length();
                    }
                }
                if (i != 0) {
                    if (s.charAt(i - 1) != ' ' && posNextChar != i + 1) {//上一位不为空格
                        posBeforeNoChar = i;
                    }
                }
            }

        }
        return posBeforeNoChar - posNextChar;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord("Hello World"));
//        System.out.println(lengthOfLastWord("luffy is still joyboy"));
//        System.out.println(lengthOfLastWord("a "));
        System.out.println(lengthOfLastWord("Today is a nice   day"));
    }
}
