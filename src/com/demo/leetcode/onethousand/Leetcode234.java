package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode234 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1, null);
        System.out.println(isPalindrome(node));
    }

    public static boolean isPalindrome(ListNode head) {
        Deque stack = new LinkedList();
        ListNode temp = head;
        stack.push(temp);
        while (temp.next != null) {
            temp = temp.next;
            stack.push(temp);
        }
        ListNode n = null;
        ListNode cur = null;
        while (stack.size() != 0) {
            ListNode node = (ListNode) stack.poll();
            if (n == null) {
                n = new ListNode(node.val);
                cur = n;
            } else {
                cur.next = new ListNode(node.val);;
                cur = cur.next;
            }
        }
        while (head.next != null) {
            if (n.val != head.val) {
                return false;
            } else {
                head = head.next;
                n = n.next;
            }

        }
        return true;
    }
}
