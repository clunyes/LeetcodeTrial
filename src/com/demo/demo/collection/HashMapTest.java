package com.demo.demo.collection;

import java.util.HashMap;

public class HashMapTest {
    static void test(int mapSize) {

        HashMap<Key, Integer> map = new HashMap<Key, Integer>(mapSize);
        for (int i = 0; i < mapSize; ++i) {
            map.put(Keys.of(i), i);
        }
        System.out.println("map size ====" + mapSize);
        long beginTime = System.nanoTime(); //获取纳秒
        for (int i = 0; i < mapSize; i++) {
            map.get(Keys.of(i));
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - beginTime);
        System.out.println("avg====" + (float) (endTime - beginTime) / mapSize);
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 10000000; i *= 10) {
            test(i);
        }
    }
}
