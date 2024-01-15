package com.demo.javademo.io.serial;

import java.io.UnsupportedEncodingException;

public class DecodeDemo {

    public static void main(String[] args) {

        String str1 = "中文";
        byte[] bytes = new byte[0];
        try {
            bytes = str1.getBytes("UTF-8");
            System.out.println(bytes);
            String str2 = new String(bytes, "UTF-8");
            System.out.println(str2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
