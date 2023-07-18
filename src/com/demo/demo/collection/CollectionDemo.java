package com.demo.demo.collection;

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

        ConcurrentHashMap cmap = new ConcurrentHashMap();
    }
}
