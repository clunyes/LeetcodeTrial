package com.demo.leetcode.twothousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Leetcode1282 {

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,3,3,2};
        groupThePeople(arr);
        System.out.println("end");
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!map.containsKey(size)) {
                LinkedList l = new LinkedList();
                l.add(i);
                map.put(size, l);
            } else {
                map.get(size).add(i);
            }
        }
        for (Integer key : map.keySet()) {
            LinkedList<Integer> list = map.get(key);
            while (list.size() != 0) {
                int size = key;
                List<Integer> temp = new ArrayList<>();
                while (size != 0) {
                    temp.add(list.poll());
                    size--;
                }
                result.add(temp);
            }
        }
        return result;
    }

}
