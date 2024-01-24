package com.demo.leetcode.threethousand

object Leetcode2865 {
    @JvmStatic
    fun main(args: Array<String>) {
        println(maximumSumOfHeights(listOf(5,2,4,4)))
    }

    fun maximumSumOfHeights(maxHeights: List<Int>): Long {
        val n = maxHeights.size
        var res: Long = 0
        for (i in 0 until n) {
            var pre = maxHeights[i]
            var sum = pre.toLong()
            for (j in i - 1 downTo 0) {
                pre = Math.min(pre, maxHeights[j])
                sum += pre.toLong()
            }
            var suf = maxHeights[i]
            for (j in i + 1 until n) {
                suf = Math.min(suf, maxHeights[j])
                sum += suf.toLong()
            }
            res = Math.max(res, sum)
        }
        return res
    }
}