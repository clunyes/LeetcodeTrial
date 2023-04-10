package com.demo.leetcode.twothousand;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1331 {

    public static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 1) {
            arr[0] = 1;
            return arr;
        }
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 1; i < arrCopy.length; i++) {
            if (i == 1) {
                map.put(arrCopy[i - 1], count);
            }
            if (arrCopy[i - 1] < arrCopy[i]) {
                count++;
            }
            map.put(arrCopy[i], count);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                arr[i] = map.get(arr[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12, 5};
        int[] arr = {-49};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
