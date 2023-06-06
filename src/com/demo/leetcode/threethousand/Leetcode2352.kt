package com.demo.leetcode.threethousand

object Leetcode2352 {
    @JvmStatic
    fun main(args: Array<String>) {
        val matrix = arrayOf(intArrayOf(3, 2, 1), intArrayOf(1, 7, 6), intArrayOf(2, 7, 7))
        println(equalPairs(matrix))
    }

    fun equalPairs(grid: Array<IntArray>): Int {
        var res = 0
        val n = grid.size
        for (row in 0 until n) {
            for (col in 0 until n) {
                if (equal(row, col, n, grid)) {
                    res++
                }
            }
        }
        return res
    }

    fun equal(row: Int, col: Int, n: Int, grid: Array<IntArray>): Boolean {
        for (i in 0 until n) {
            if (grid[row][i] != grid[i][col]) {
                return false
            }
        }
        return true
    }
}