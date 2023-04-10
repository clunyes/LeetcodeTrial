package com.demo.leetcode.twothousand;

public class Leetcode1860 {
    public static void main(String[] args) {
        System.out.println(memLeak(8,11));
    }

    public static int[] memLeak(int memory1, int memory2) {
        int time = 1;
        while (memory1 >= time || memory2 >= time) {
            if (memory1 >= memory2) {
                memory1 -= time;
            } else {
                memory2 -= time;
            }
            time++;
        }
        int[] result = new int[3];
        result[0] = time;
        result[1] = memory1;
        result[2] = memory2;
        return result;
    }
}
