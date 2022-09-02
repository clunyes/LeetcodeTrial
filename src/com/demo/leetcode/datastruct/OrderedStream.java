package com.demo.leetcode.datastruct;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    private String[] array;
    private int index;

    private List<String> temp;

    public OrderedStream(int n) {
        array = new String[n];
        index = 0;
        temp = new ArrayList<>();
    }

    public List<String> insert(int idKey, String value) {
        idKey--;
        temp.clear();
        array[idKey] = value;
        for (int i = index; i < array.length; i++) {
            if (array[index] != null) {
                temp.add(array[index]);
                index = i + 1;
            } else {
                break;
            }
        }
        return temp;
    }
}

