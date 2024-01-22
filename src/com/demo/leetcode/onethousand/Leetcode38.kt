package com.demo.leetcode.onethousand

fun main() {
    System.out.println(countAndSay(6))
}

fun countAndSay(n: Int): String {
    var str = "1"
    for (i in 2 until n + 1) {
        val sb = StringBuilder()
        var start = 0
        var pos = 0

        while (pos < str.length) {
            while (pos < str.length && str[pos] == str[start]) {
                pos++
            }
            sb.append((pos - start).toString()).append(str[start])
            start = pos
        }
        str = sb.toString()
    }

    return str
}