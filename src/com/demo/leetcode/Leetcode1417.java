package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Leetcode1417 {

    public static void main(String[] args) {

    }


    public String reformat(String s) {
        char[] arr = s.toCharArray();
        List numList = new ArrayList();
        List charList = new ArrayList();
        for (char c : arr) {

            if (c - 'a' >= 0 && c - 'a' <= 26) {
                charList.add(c);
            } else {
                numList.add(c);
            }

        }
        StringBuilder sb = new StringBuilder();
        if (Math.abs(numList.size() - charList.size()) >= 2) {
            return "";
        } else {
            if (charList.size() > numList.size()) {
                for (int i = 0; i < numList.size(); i++) {
                    sb.append(charList.get(i)).append(numList.get(i));
                }
                sb.append(charList.get(charList.size() - 1));
            } else if (charList.size() == numList.size()) {
                for (int i = 0; i < numList.size(); i++) {
                    sb.append(charList.get(i)).append(numList.get(i));
                }
            } else {
                for (int i = 0; i < charList.size(); i++) {
                    sb.append(numList.get(i)).append(charList.get(i));
                }
                sb.append(numList.get(numList.size() - 1));
            }

            return sb.toString();
        }
    }
}
