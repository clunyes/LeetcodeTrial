package com.demo.graph;

import java.util.HashSet;
import java.util.Stack;

public class GraphDfs {

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        //栈保存 深度路径
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();
        stack.add(node);
        set.add(node);
        System.out.println(node.value);
        while (!stack.isEmpty()){
          Node cur =  stack.pop();
          for (Node next: cur.nexts){
              if(!set.contains(next)){
                  stack.push(cur);
                  stack.push(next);
                  set.add(next);
                  System.out.println(next.value);
                  break;
              }
          }
        }
    }
}
