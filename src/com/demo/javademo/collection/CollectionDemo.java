package com.demo.javademo.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        System.out.println("实现栈和队列");

        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList linkedList = new LinkedList();

        HashMap<String, String> hashmap = new HashMap<>();

        String s1= hashmap.put("001","zhangsan");
        String s2=hashmap.put("001","wangwu");
        String s3=hashmap.put("001","zhaosi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        ConcurrentHashMap cmap = new ConcurrentHashMap();
    }
}
