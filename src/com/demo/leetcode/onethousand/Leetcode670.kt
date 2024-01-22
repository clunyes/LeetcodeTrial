package com.demo.leetcode.onethousand

import kotlin.math.max

fun main() {
//        System.out.println(maximumSwap(2736));
    println(maximumSwap(98368))
    println(maximumSwap(2736))
}

fun maximumSwap(num: Int): Int {
    val charArray = num.toString().toCharArray()
    var result = 0
    for (i in 0 until charArray.size) {
        for (j in i until charArray.size) {
            swap(charArray, i, j)
            result = max(result, String(charArray).toInt())
            swap(charArray, i, j)
        }
    }
    return result
}

fun swap(charArray: CharArray, i: Int, j: Int) {
    val temp = charArray[i]
    charArray[i] = charArray[j];
    charArray[j] = temp;
}