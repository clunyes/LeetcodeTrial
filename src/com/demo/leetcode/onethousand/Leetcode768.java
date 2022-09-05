package com.demo.leetcode.onethousand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode768 {

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 1, 0, 0, 1};
//        int[] arr = new int[]{2, 1, 3, 4, 4};
//        int[] arr = new int[]{0,3,0,3,2};
        int[] arr = new int[]{5,4,3,2,1};
        System.out.println(maxChunksToSorted(arr));
    }

    public static int maxChunksToSorted(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int[] origin = arr.clone();//原始数组
        Arrays.sort(arr);//排序数组
        for (int i = 0; i < arr.length; i++) {
            int x = origin[i], y = arr[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) == 0) {
                map.remove(x);
            }
            map.put(y, map.getOrDefault(y, 0) - 1);
            if (map.get(y) == 0) {
                map.remove(y);
            }
            if (map.isEmpty()) {
                result++;
            }
        }

        return result;
    }


}
