package com.demo.leetcode.twothousand;

import java.util.*;

public class Leetcode1636 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 3, 2};
        frequencySort(arr);
    }

    static class Num implements Comparable<Num> {
        int num;
        int count;

        public Num(int num, int count) {
            this.num = num;
            this.count = count;
        }


        @Override
        public int compareTo(Num target) {
            if (this.count != target.count) {

                return this.count - target.count;
            } else {
                return target.num - this.num;
            }
        }
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Num> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(new Num(key, map.get(key)));
        }
        Collections.sort(list);
        List<Integer> resultl = new ArrayList<>();
        for (Num num : list) {
            for (int i = 0; i < num.count; i++) {
                resultl.add(num.num);
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < resultl.size(); i++) {
            result[i] = resultl.get(i);
        }
//        return result;
        return resultl.stream().mapToInt(Integer::intValue).toArray();
    }
}
