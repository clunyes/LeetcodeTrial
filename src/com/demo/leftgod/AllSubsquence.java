package com.demo.leftgod;

public class AllSubsquence {

    public static void main(String[] args) {
        printAllSubSequence("abc");
    }

    public static void printAllSubSequence(String str) {
        char[] chs = str.toCharArray();
        process(chs, 0);
    }

    public static void process(char[] str, int i) {
        if (i == str.length) {
            System.out.println(String.valueOf(str));
            return;
        }
        process(str, i + 1);
        char temp = str[i];
        str[i] = '*';
        process(str, i + 1);
        str[i] = temp;
    }

}
