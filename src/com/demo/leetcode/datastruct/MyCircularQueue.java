package com.demo.leetcode.datastruct;

public class MyCircularQueue {
    //使用front rear更合理
    private int[] list;
    private int fullSize;
    private int head;
    private int length;

    public MyCircularQueue(int k) {
        list = new int[k];
        for (int i = 0; i < k; i++) {
            list[i] = -1;
        }
        fullSize = k;
        head = 0;
    }

    public boolean enQueue(int value) {
        boolean result = false;
        if (length < fullSize) {
            list[(head + length) % fullSize] = value;
            length++;
            result = true;
        }
        return result;
    }

    public boolean deQueue() {
        boolean result = false;
        if (length != 0) {
            list[head % fullSize] = -1;
            length--;
            head++;
            result = true;
        }
        return result;
    }

    public int Front() {
        return list[head % fullSize];
    }

    public int Rear() {
        if (isEmpty()) {
            return Front();
        }
        return list[(head + length - 1) % fullSize];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == fullSize;
    }
}

