package com.demo.leetcode;

import java.util.*;

public class Leetcode753 {

    public static int openLock(String[] deadends, String target) {
        Set<String> dead_set = new HashSet<>(Arrays.asList(deadends));//死亡数字转为哈希表
        if (dead_set.contains("0000")) return -1;//死亡数字如果含有初始节点，返回-1
        Queue<String> queue = new LinkedList<>();//队列
        queue.add("0000");//加入初始节点
        int count = 0;//记录步数
        while (!queue.isEmpty()) {//节点未访问完，队列内的节点不为空
            int size = queue.size();//每一步节点数
            while (size-- > 0) {
                String tmp = queue.remove();//弹出头节点
                if (target.equals(tmp)) return count;//如果与目标数相同，直接返回步数
                char[] c = tmp.toCharArray();//转为数组
                for (int j = 0; j < 4; j++) {//每次修改四位数字的一位
                    int i = c[j] - '0';//转为int型
                    c[j] = (char) ('0' + (i + 9) % 10);//数字-1。余数运算可防止节点为0、9时出现-1、10的情况
                    String s = new String(c);//得到新字符串
                    if (!dead_set.contains(s)) {//字符串不在死亡数字中时
                        queue.add(s);//添加到队列作为下一步需要遍历的节点
                        dead_set.add(s);//下一步必访问该节点，所以可先加入到死亡数字
                    }
                    c[j] = (char) ('0' + (i + 11) % 10);//数字+1
                    s = new String(c);
                    if (!dead_set.contains(s)) {
                        queue.add(s);
                        dead_set.add(s);
                    }
                    c[j] = (char) ('0' + i);//重置回初始值
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
       System.out.println(openLock(deadends,"0202"));
    }
}
