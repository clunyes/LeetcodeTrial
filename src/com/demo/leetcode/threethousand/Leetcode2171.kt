package com.demo.leetcode.threethousand

import java.util.*

fun main() {
    println(minimumRemoval(intArrayOf(4, 1, 6, 5)))
    println(minimumRemoval(intArrayOf(2, 10, 3, 2)))
}


fun minimumRemoval(beans: IntArray): Long {
    val n = beans.size
    Arrays.sort(beans)
    var total: Long = 0
    for (i in 0 until n) {
        total += beans[i]
    }
    var result: Long = total
    for (i in 0 until n) {
        result = kotlin.math.min(result, total - beans[i].toLong() * (n - i))
    }
    return result
}