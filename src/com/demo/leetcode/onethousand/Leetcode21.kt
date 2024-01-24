package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.ListNode


fun main() {
    val node1 = ListNode(1)
    node1.next = ListNode(2)
    node1.next.next = ListNode(4)
    val node2 = ListNode(1)
    node2.next = ListNode(3)
    node2.next.next = ListNode(4)
    ListNode.printList(mergeTwoLists(node1, node2))
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    //递归
    return if (list1 == null) {
        list2
    } else if (list2 == null) {
        list1
    } else if(list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        list1
    }else {
        list2.next = mergeTwoLists(list1, list2.next)
        list2
    }
}