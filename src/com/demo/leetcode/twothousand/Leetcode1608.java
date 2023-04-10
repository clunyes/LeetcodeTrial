package com.demo.leetcode.twothousand;

import java.util.Arrays;

public class Leetcode1608 {

    public static void main(String[] args) {
//        int[] arr = new int[]{0, 4, 3, 0, 4};
//        int[] arr = new int[]{3, 5};
        int[] arr = new int[]{3};
//        int[] arr = new int[]{3, 9, 7, 8, 3, 8, 6, 6};
//        int[] arr = new int[]{3, 6, 7, 7, 0};
//        int[] arr = new int[]{0,0};
        System.out.println(specialArray(arr));
    }


    public static int specialArray(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] > 0) {
                return 1;
            } else {
                return -1;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[nums.length - 1] < i) {
                    return i;
                }
            } else if (i == nums.length - 1) {
                if (nums[0] >= i) {
                    return nums.length;
                }
            } else {
                if (nums[nums.length - i] >= i && nums[nums.length - i - 1] < i) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 二分
     * @param nums
     * @return
     */
    public int specialArray2(int[] nums) {
        int right = nums.length;
        int left = 1;
        while (left <= right) {
            int x = (left + right) / 2;
            int count = getCount(nums, x);
            if (count == x) {
                return x;
            } else if (count > x) {
                left = x + 1;
            } else {
                right = x - 1;
            }
        }
        return -1;
    }

    public int getCount(int[] nums, int x) {
        int count = 0;
        for (int num : nums) {
            if (num >= x) {
                count++;
            }
        }
        return count;
    }
}
