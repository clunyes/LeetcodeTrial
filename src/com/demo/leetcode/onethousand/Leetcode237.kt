package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.ListNode


fun main() {

}

fun deleteNode(node: ListNode?) {
    val next = node?.next

    node?.`val` = next?.`val`
    node?.next = next?.next
}