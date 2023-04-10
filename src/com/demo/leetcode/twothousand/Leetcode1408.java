package com.demo.leetcode.twothousand;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1408 {

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String target = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                String word = words[j];
                if (word.contains(target)) {
                    result.add(target);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
}
