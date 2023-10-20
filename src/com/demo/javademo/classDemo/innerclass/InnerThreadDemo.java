package com.demo.javademo.classDemo.innerclass;

public class InnerThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i + " ");
                }
            }
        };
        t.start();
    }
}
