package com.demo.leetcode.onethousand

fun main() {
    System.out.println(strStr("sadbutsad","sad"))
    System.out.println(strStr("leetcode","leeto"))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}