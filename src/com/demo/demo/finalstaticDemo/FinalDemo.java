package com.demo.demo.finalstaticDemo;

import com.demo.demo.keyword.Father;

public class FinalDemo {
    public static void main(String[] args) {
        final int x = 1;
// x = 2;  // cannot assign vsalue to final variable 'x'
        final Father y = new Father();
        y.setName("zhao");
    }
}
