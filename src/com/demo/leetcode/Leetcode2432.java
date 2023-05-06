package com.demo.leetcode;

public class Leetcode2432 {

    public static void main(String[] args) {
//        int[][] logs = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        int[][] logs = {{373,5},{445,6},{471,11},{419,14},{201,16},{327,18}};
//        int[][] logs = {{1, 1}, {3, 7}, {2, 12}, {7, 17}};
//        System.out.println(hardestWorker(10, logs));
        System.out.println(hardestWorker(70, logs));
//        System.out.println(hardestWorker(25, logs));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int pos = 0;
        int max = 0;
        int workStart = 0;
        for (int row = 0; row < logs.length; row++) {
            int work = logs[row][1];
            if (row == 0) {
                max = work;
                workStart = max;
            } else {
                if (work - workStart > max) {
                    max = work - workStart;
                    pos = row;
                } else if (work - workStart == max) {
                    int idPos = logs[pos][0];
                    int idNow = logs[row][0];
                    if (idNow < idPos) {
                        pos = row;
                    }
                }
                workStart = work;
            }
        }
        return logs[pos][0];
    }
}

