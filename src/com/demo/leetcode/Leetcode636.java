package com.demo.leetcode;

import com.sun.jdi.request.StepRequest;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Leetcode636 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("0:start:0");
        list.add("0:start:2");
        list.add("0:end:5");
        list.add("1:start:7");
        list.add("1:end:7");
        list.add("0:end:8");
        System.out.println(exclusiveTime(2, list));
    }


    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < logs.size(); i++) {
            String[] arr = logs.get(i).split(":");
            int pid = Integer.parseInt(arr[0]);
            int time = Integer.parseInt(arr[2]);
            boolean isStart = arr[1].equals("start");
            int[] preFunc = stack.isEmpty() ? null : stack.peek();
            if (isStart) {
                if (preFunc != null)
                    result[preFunc[0]] += time - preFunc[1];
                int[] curFunc = new int[]{pid, time};
                stack.push(curFunc);
            } else {
                if (preFunc != null) {
                    result[pid] += time - preFunc[1] + 1;
                    stack.pop();
                    if (!stack.isEmpty()) {
                        stack.peek()[1] = time + 1;
                    }
                }
            }
        }
        return result;
    }
}
