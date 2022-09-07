package com.demo.leetcode.onethousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Leetcode299 {

    public static void main(String[] args) {
//        System.out.println(getHint("1123", "0111"));
        System.out.println(getHint("1807", "7810"));
    }

    public static String getHint(String secret, String guess) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            int skey = secret.charAt(i) - '0';
            int gkey = guess.charAt(i) - '0';
            if (skey == gkey) {
                aCount++;
            }
            int count = map.getOrDefault(skey, 0);
            map.put(skey, count+1);
        }
        for (int i = 0; i < guess.length(); i++) {
            int gkey = guess.charAt(i) - '0';
            if (map.containsKey(gkey)) {
                int value = map.get(gkey);
                if (value > 0) {
                    map.put(gkey, value - 1);
                }
            }
        }
        int all = 0;
        for (Integer key : map.keySet()) {
            all += map.get(key);
        }
        bCount = secret.length() - all - aCount;
        StringBuilder sb = new StringBuilder();
        sb.append(aCount + "A");
        sb.append(bCount + "B");
        return sb.toString();
    }
}
