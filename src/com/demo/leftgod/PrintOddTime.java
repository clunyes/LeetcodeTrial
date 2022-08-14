package com.demo.leftgod;

public class PrintOddTime {

    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        int rightOne = eor & (~eor + 1);

        int onlyOne = 0;
        for (int cur : arr) {
            if ((cur & rightOne) == rightOne) {
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }

    public static void main(String[] args) {
        int arr[] = {12,16,16,16,4,4};
        printOddTimesNum2(arr);
    }
}
