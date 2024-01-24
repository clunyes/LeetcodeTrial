package com.demo.leetcode.threethousand

import kotlin.math.abs
import kotlin.math.max

fun main() {
//    System.out.println(alternatingSubarray(intArrayOf(2, 3, 4, 3, 4)))
    System.out.println(alternatingSubarray(intArrayOf(6,7,6,5,6)))
//    System.out.println(alternatingSubarray(intArrayOf(13, 14, 15, 14)))
}


fun alternatingSubarray(nums: IntArray): Int {
    var maxL = -1
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            var length = j - i + 1
            if (nums[j] - nums[i] == (length - 1) % 2) {
                maxL = max(maxL, length)
            } else {
                break
            }
        }
    }
    return maxL
}