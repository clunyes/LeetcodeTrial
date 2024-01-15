package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.ListNode;

public class Leetcode82 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);
        ListNode.printList(deleteDuplicates(node));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            //当前节点与后一个节点值相等，cur往后移动
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                //pre节点就是cur节点
                pre = cur;
            } else {
                //跳点了，连接到当前节点
                pre.next = cur.next;
            }
            //进行下一轮
            cur = cur.next;
        }
        return dummy.next;
    }
}
