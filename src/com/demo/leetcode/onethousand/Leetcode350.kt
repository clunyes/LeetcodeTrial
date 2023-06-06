package com.demo.leetcode.onethousand

class Leetcode350 {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for (n in nums1) {
            if (map.containsKey(n)) {
                map[n] = map[n]!! + 1
            } else {
                map[n] = 1
            }
        }
        val list = ArrayList<Int>()
        for (n in nums2) {
            if (map.containsKey(n)) {
                map[n] = map[n]!! - 1
                if (map[n] == 0) {
                    map.remove(n)
                }
                list.add(n)
            }
        }
        val iArray = IntArray(list.size)
        for (i in list.indices) {
            iArray[i] = list[i]
        }
        return iArray
    }

}