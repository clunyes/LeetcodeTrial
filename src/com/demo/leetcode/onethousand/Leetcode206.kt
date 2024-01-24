package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.ListNode

fun main() {
    val node = ListNode(1)
    node.next = ListNode(2)
    node.next.next = ListNode(3)
    node.next.next.next = ListNode(4)
    node.next.next.next.next = ListNode(5)
    ListNode.printList(reverseList(node))
}

fun reverseList(head: ListNode): ListNode? {
    var cur = ListNode(0)
    cur.next = head

    val arrayList = arrayListOf<ListNode>()

    while (cur.next != null) {
        arrayList.add(cur.next)
        cur = cur.next
    }

    arrayList.reverse()

    var curL = ListNode(0)
    var head: ListNode? = null
    for (ln in arrayList) {
        if (head == null) {
            head = ln
        }
        curL.next = ln
        curL = ln
    }
    curL.next = null
    return head
}