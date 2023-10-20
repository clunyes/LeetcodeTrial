package com.demo.javademo.concurrent.unsafe;

public class ThreadUnsafeExample {
    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}
