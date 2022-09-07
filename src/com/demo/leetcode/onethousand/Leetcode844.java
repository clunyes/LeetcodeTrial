package com.demo.leetcode.onethousand;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Stack;

public class Leetcode844 {

    public static void main(String[] args) {
//        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                stack1.poll();
            } else {
                stack1.push(s.charAt(i) - 'a');
            }
        }
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                stack2.poll();
            } else {
                stack2.push(t.charAt(i) - 'a');
            }
        }
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.poll() != stack2.poll()) {
                return false;
            }
        }
        if (stack1.size() != stack2.size()) {
            return false;
        }
        return true;
    }
}
