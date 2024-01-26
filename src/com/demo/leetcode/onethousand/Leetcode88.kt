package com.demo.leetcode.onethousand


fun main() {
    merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    for (i in m until m + n) {
        nums1[i] = nums2[i - m]
    }
    nums1.sort()
}