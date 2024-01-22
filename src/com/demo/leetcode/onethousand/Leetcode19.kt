package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.ListNode
import com.demo.leetcode.datastruct.ListNode.printList

fun main() {
    val node = ListNode(1)
    node.next = ListNode(2)
    node.next.next = ListNode(3)
    node.next.next.next = ListNode(4)
    node.next.next.next.next = ListNode(5)
    printList(removeNthFromEnd(node, 2))
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val pre = ListNode(0)
    pre.next = head
    var start = pre
    var end = pre
    for (i in 0 until n) {
        end = end.next
    }
    while (end.next != null) {
        end = end.next
        start = start.next
    }
    start.next = start.next.next
    return head
}
