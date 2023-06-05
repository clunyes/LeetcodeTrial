package com.demo.leetcode.study.easy

fun main() {
//    System.out.println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    System.out.println(removeDuplicates(intArrayOf(1,1,2)))
}

fun removeDuplicates(nums: IntArray): Int {
    var map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val key = nums[i]
        if (!map.containsKey(key)) {
            map[key] = 1
        } else {
            map[key] = map[key]!!.inc()
        }
    }
    var expectedNums: IntArray
    var expList = mutableListOf<Int>()
    var index = 0
    for ((key, value) in map) {
        expList.add(index, key)
        index++
    }
    expectedNums = expList.toIntArray()
    return expectedNums.size
}