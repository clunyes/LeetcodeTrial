package com.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1403 {

    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        int total = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp += nums[i];
            list.add(nums[i]);
            System.out.println(nums[i]);
            if (temp > total - temp) {
                break;
            }
        }
//        int[] indexArray = new int[nums.length - pos];
//        for (int i = nums.length - 1; i >= pos; i--) {
//            indexArray[nums.length - 1 - i] = list.indexOf(nums[i]);
//        }
//        Arrays.sort(indexArray);
//        for (int index : indexArray) {
//            result.add(list.get(index));
//            System.out.println(list.get(index));
//        }
        return list;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{4, 3, 10, 9, 8};
        int[] arr = new int[]{4,4,7,6,7};
        minSubsequence(arr);
    }
}
