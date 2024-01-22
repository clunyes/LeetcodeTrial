package com.demo.leetcode.onethousand

import java.lang.StringBuilder

fun main() {
    System.out.println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    System.out.println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }
    var pos = 0
    val firstStr = strs[0]
    val sbTemp = StringBuilder()
    val sb = StringBuilder()
    for (i in 0 until firstStr.length) {
        val f = firstStr[pos]
        sbTemp.append(f)
        var indexFlag = true
        for (j in 0 until strs.size) {
            val str = strs[j]
            indexFlag = str.indexOf(sbTemp.toString()) == 0
            if (!indexFlag) {
                break
            }
        }
        if (indexFlag) {
            sb.append(f)
            pos++
        } else {
            break
        }
    }
    return sb.toString()
}