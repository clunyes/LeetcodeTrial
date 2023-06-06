package com.demo.leetcode.study.easy

fun main() {

}

fun containsDuplicate(nums: IntArray): Boolean {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map.containsKey(nums[i])) {
            return true
        } else {
            map.put(nums[i], 1)
        }
    }
    return false
}