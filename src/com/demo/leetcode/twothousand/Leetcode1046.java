package com.demo.leetcode.twothousand;

import java.util.Arrays;
import java.util.Map;

public class Leetcode1046 {

    public static void main(String[] args) {
//        int[] arr = new int[]{2, 7, 4, 1, 8, 1};
        int[] arr = new int[]{100, 1, 1};
        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 0) {
            return 0;
        }
        Arrays.sort(stones);
        int r1 = stones[stones.length - 1];
        int r2 = stones[stones.length - 2];
        int[] next;
        if (r1 != r2) {
            next = Arrays.copyOfRange(stones, 0, stones.length - 1);
            next[stones.length - 2] = Math.abs(r1 - r2);
        } else {
            next = Arrays.copyOfRange(stones, 0, stones.length - 2);
        }
        return lastStoneWeight(next);
    }
}
