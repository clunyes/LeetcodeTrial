package com.demo.leetcode.threethousand

fun main() {
    System.out.println(sumIndicesWithKSetBits(listOf(5, 10, 1, 5, 2), 1))
}

fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
    var ans = 0;
    for (i in 0 until nums.size) {
        if (bitCount(i) == k) {
            ans += nums.get(i);
        }
    }
    return ans;
}

fun bitCount(x: Int): Int {
    var cnt = 0
    var xx = x
    while (xx != 0) {
        cnt += (xx % 2)
        xx /= 2
    }
    return cnt
}