package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.ListNode
import java.util.*

fun main() {
    val node = ListNode(1)
    node.next = ListNode(2)
    node.next.next = ListNode(2)
    node.next.next.next = ListNode(1, null)
    println(isPalindrome(node))
}

fun isPalindrome(head: ListNode?): Boolean {
    val stack = LinkedList<ListNode?>()
    var temp = head
    stack.push(temp)
    while (temp?.next != null) {
        temp = temp.next
        stack.push(temp)
    }
    var n: ListNode? = null
    var cur: ListNode? = null
    while (stack.size != 0) {
        val node = stack.poll() as ListNode
        if (n == null) {
            n = ListNode(node.`val`)
            cur = n
        } else {
            cur!!.next = ListNode(node.`val`)
            cur = cur!!.next
        }
    }
    var h = head
    while (h?.next != null) {
        if (n!!.`val` != h.`val`) {
            return false
        } else {
            h = h.next
            n = n.next
        }
    }
    return true
}