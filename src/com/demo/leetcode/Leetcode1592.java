package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1592 {

    public static void main(String[] args) {
        System.out.println(reorderSpaces(" practice   makes   perfect"));
//        System.out.println(reorderSpaces(" hello"));
    }

    public static String reorderSpaces(String text) {
        if (text.length() == 1) {
            return text;
        }
        //split("\\s+")多个制表符分割
        String[] words2 = text.trim().split("\\s+");
        List<String> words = new ArrayList<>();
        int blankCount = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (start == -1) {
                    start = i;
                }
                if (i == text.length() - 1) {
                    end = i + 1;
                    words.add(text.substring(start, end));
                }
            } else {
                blankCount++;
                if (start != -1) {
                    end = i;
                    words.add(text.substring(start, end));
                }
                start = -1;
                end = -1;
            }

        }
        StringBuilder sbb = new StringBuilder();
        int bc = words.size() == 1 ? 0 : blankCount / (words.size() - 1);
        for (int i = 0; i < bc; i++) {
            sbb.append(' ');
        }
        String b = sbb.toString();
        StringBuilder sbb2 = new StringBuilder();
        int be = words.size() == 1 ? blankCount : blankCount % (words.size() - 1);
        for (int i = 0; i < be; i++) {
            sbb2.append(' ');
        }
        String endB = sbb2.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i == words.size() - 1) {
                sb.append(endB);
            } else {
                sb.append(b);
            }
        }

        return sb.toString();
    }
}
