package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode19 {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        //开始设置两个节点start和end  两个节点指向同一个位置 将satrt节点先移动n个位置 之后再将end和start节点一起移动  直到start节点的next指向空
        //这时将end.next指向next.next
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        //删除掉第n个节点之后将后一个节点的next指向next.next这样才能连接整个链表
        //最后返回pre.next防止删除的是head节点
        end.next = end.next.next;
        return pre.next;

    }
}
