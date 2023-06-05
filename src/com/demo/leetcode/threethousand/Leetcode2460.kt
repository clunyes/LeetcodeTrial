package com.demo.leetcode.threethousand

fun main() {
    System.out.println(applyOperations(intArrayOf(847,847,0,0,0,399,416,416,879,879,206,206,206,272)))
//    System.out.println(applyOperations(intArrayOf(0,1)))
}

fun applyOperations(nums: IntArray): IntArray {
    for (i in nums.indices) {
        if (i == nums.size - 1) {
            break
        }
        if (nums[i] == nums[i + 1] && nums[i] != 0) {
            nums[i] = nums[i] * 2
            nums[i + 1] = 0
        }
    }

    for (i in nums.indices) {
        if (i == nums.size - 1) {
            break
        }
        if (nums[i] == 0) {
            for (j in i + 1 until nums.size) {
                if (j >= nums.size) {
                    break
                }
                if (nums[j] != 0) {
                    var temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    break
                }
            }
        } else {
            continue
        }
    }
    return nums
}