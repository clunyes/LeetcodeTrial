package com.demo.leetcode.datastruct;

public class MyCircularDeque {

    int front;
    int rear;
    int length;
    private int fullSize;
    private int[] array;

    public MyCircularDeque(int k) {
        front = 0;
        rear = 0;
        length = 0;
        fullSize = k;
        array = new int[k + 1];
    }

    public boolean insertFront(int value) {
        if (length == array.length - 1) {
            return false;
        }
        if (length != 0) {
            front = (front + fullSize - 1) % fullSize;
        }
        array[front] = value;
        length++;
        return true;
    }

    public boolean insertLast(int value) {
        if (length == array.length - 1) {
            return false;
        }
        if (length != 0) {
            rear = (rear + 1) % fullSize;
        }
        array[rear] = value;
        length++;
        return true;
    }

    public boolean deleteFront() {
        if (length == 0) {
            return false;
        }
        length--;
        if (length != 0) {
            front = (front + 1) % fullSize;
        }
        return true;
    }

    public boolean deleteLast() {
        if (length == 0) {
            return false;
        }
        length--;
        if (length != 0) {
            rear = (rear + fullSize - 1) % fullSize;
        }
        return true;
    }

    public int getFront() {
        if (length == 0) {
            return -1;
        }
        return array[front];
    }

    public int getRear() {
        if (length == 0) {
            return -1;
        }
        return array[rear];
    }

    public boolean isEmpty() {
        return length == 0 ? true : false;
    }

    public boolean isFull() {
        return length == fullSize ? true : false;
    }
}
