package com.demo.leetcode.onethousand;

import java.util.HashMap;

public class Leetcode242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        for (char c : sA) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : tA) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
        return map1.equals(map2);
    }
}
