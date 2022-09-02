package com.demo.leftgod;

import com.demo.leetcode.datastruct.ListNode;

//链表逆序除了栈的另一种方法，指针调整
public class Reverse {
    private Node head;//头指针
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node pre = null; // 前驱节点
        Node cur = null; // 当前节点
        Node next = null; // 后继节点

        // 把链表首节点变为尾节点
        cur = head.next;
        next = cur.next;
        cur.next = null;
        pre = cur;
        cur = next;
        // 使当前遍历到的节点 cur 指向前驱节点
        while (cur.next != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        cur.next = pre;
        head.next = cur;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
