package com.demo.leetcode.study.easy

import java.util.*

fun main() {
    rotate(intArrayOf(1,2), 3)
//    rotate(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
}

fun rotate(nums: IntArray, k: Int): Unit {
    var nk = k % nums.size
    if (nums.size == 1) {
        return
    }
    var top = nums.sliceArray(0 until nums.size - nk)
    var end = nums.sliceArray(nums.size - nk until nums.size)
    var nNums = end.plus(top)
    for (i in nums.indices) {
        nums[i] = nNums[i]
    }
    System.out.println(Arrays.toString(nums))
}