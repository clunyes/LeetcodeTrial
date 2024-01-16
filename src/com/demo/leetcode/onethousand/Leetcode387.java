package com.demo.leetcode.onethousand;

import com.demo.javademo.collection.Keys;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leetcode387 {

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Character c = a[i];
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }
        int pos = -1;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) it.next();
            if (entry.getValue() != -1) {
                if (pos == -1) {
                    pos = entry.getValue();
                } else {
                    pos = Math.min(pos, entry.getValue());
                }
            }
        }
        return pos;
    }
}
