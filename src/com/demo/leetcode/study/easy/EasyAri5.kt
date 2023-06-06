package com.demo.leetcode.study.easy

fun main() {

}

fun singleNumber(nums: IntArray): Int {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map.containsKey(nums[i])) {
            map.put(nums[i], map.get(nums[i])!!.toInt() + 1)
        } else {
            map.put(nums[i], 1)
        }
    }
    for ((key, value) in map) {
        if (value == 1) {
            return key
        }
    }
    return 0
}