package com.demo.leetcode;

import java.util.HashSet;

public class Leetcode593 {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet disSet = new HashSet();

        disSet.add(getDistance(p1, p2));
        disSet.add(getDistance(p1, p3));
        disSet.add(getDistance(p1, p4));
        disSet.add(getDistance(p2, p3));
        disSet.add(getDistance(p2, p4));
        disSet.add(getDistance(p3, p4));
        if (disSet.size() == 2) {
            if(disSet.contains(0.0)){
                return false;
            }
            return true;
        }
        return false;
    }

    private static double getDistance(int[] p1, int[] p2) {
        return Math.sqrt((p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]));
    }

    public static void main(String[] args) {
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {0, 0};
        int[] p4 = {0, 0};
        System.out.println(validSquare(p1, p2, p3, p4));
    }
}
