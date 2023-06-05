package com.demo.leetcode.study.easy

import kotlin.math.max

fun main() {
    System.out.println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
}

fun maxProfit(prices: IntArray): Int {
    var max = 0
    for (i in 0 until prices.size - 1) {
        max += max((prices[i + 1] - prices[i]), 0)
    }
    return max
}