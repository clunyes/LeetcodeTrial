package com.demo.leetcode.onethousand;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode14 {

    public static void main(String[] args) {
        String[] arr = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int index = 0;
        int pos = getSameIndex(strs, index);
        if (pos == -1) {
            return "";
        }
        int res = 0;
        while (res != -1) {
            index++;
            res = getSameIndex(strs, index);
            if (res != -1) {
                pos = res;
            }
        }
        String s = strs[0];
        return s.substring(0, pos + 1);
    }

    public static int getSameIndex(String[] strs, int index) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            String content = strs[i];
            if (content.length() == 0) {
                return -1;
            }
            if (content.length() <= index) {
                return -1;
            }
            if (i == 0) {
                set.add(content.charAt(index) - 'a');
            } else {
                if (content.length() > index) {
                    if (!set.contains(content.charAt(index) - 'a')) {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        }
        return index;
    }

    /**
     *  这个思路很简洁
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        else{
            String common_prefix = strs[0];
            for (String str: strs){
                while (str.indexOf(common_prefix) != 0) {
                    common_prefix = common_prefix.substring(0, common_prefix.length() - 1);
                    if (common_prefix.isEmpty())
                        return "";
                }
            }
            return common_prefix;
        }
    }

}
