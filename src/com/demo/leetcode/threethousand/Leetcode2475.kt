package com.demo.leetcode.threethousand

fun main() {
    System.out.println(unequalTriplets(intArrayOf(4, 4, 2, 4, 3)))
}

fun unequalTriplets(nums: IntArray): Int {
    var result = 1
    var map = HashMap<Int, Int>()
    for (i in nums.indices) {
        var value = nums[i]
        if (map.containsKey(value)) {
            map[value] = map[value]!! + 1
        } else {
            map[value] = 1
        }
    }
    if (map.size == 1) {
        return 0
    }
    for ((key, value) in map) {
        result *= value
    }


    return result
}
