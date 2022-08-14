package com.demo.leftgod;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    private static int count = 0;

    public static void main(String[] args) {
        ArrayList<String> res = permutation("abcaaade");
        for (String s : res) {
            System.out.println(s);
        }
        System.out.println(count);
    }

    public static ArrayList<String> permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        char[] chs = str.toCharArray();
        process(chs, 0, res);
        return res;
    }

    private static void process(char[] str, int i, ArrayList<String> res) {
        if (i == str.length) {
            res.add(String.valueOf(str));
        }
        boolean[] visit = new boolean[26];
        for (int j = i; j < str.length; j++) {
            if (!visit[str[j] - 'a']) {
                visit[str[j] - 'a'] = true;
                swap(str, i, j);
                process(str, i + 1, res);
                swap(str, i, j);
            }
        }
    }

    public static void swap(char[] chs, int i, int j) {
        count++;
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}
