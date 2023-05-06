package com.demo.leetcode.threethousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode2399 {

    public static void main(String[] args) {
        String s1 = "abaccb";
        int[] distance1 = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(checkDistances(s1, distance1)); // expects true

        String s2 = "aa";
        int[] distance2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(checkDistances(s2, distance2)); // expects false

        /**
         * "abcabc"
         * [0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
         *
         * "abaccb"
         * [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
         */
    }


    public static boolean checkDistances(String s, int[] distance) {
        Map<Character, List<Integer>> posMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!posMap.containsKey(c)) {
                posMap.put(c, new ArrayList<>());
            }
            posMap.get(c).add(i);
        }
        for (int i = 0; i < distance.length; i++) {
            char curC = (char) ('a' + i);
            if (distance[i] == 0) {
                if (!s.contains(String.valueOf(curC))) {
                    continue;
                }
            }
            List<Integer> lisPos = posMap.get(curC);
            if (lisPos == null) {
                continue;
            }
            if (lisPos.size() != 2) {
                return false;
            }

            if (lisPos.get(1) - lisPos.get(0) - 1 != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
