package com.demo.leetcode.onethousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode640 {

    public static void main(String[] args) {
        String e = "-x=-1";
        System.out.println(solveEquation(e));
    }

    public static String solveEquation(String equation) {
        String[] arr = equation.split("=");
        String left = arr[0];
        String right = arr[1];
        Operation leftO = getOperation(left);
        Operation rightO = getOperation(right);
        int xNum = leftO.xNum - rightO.xNum;
        int total = rightO.total - leftO.total;

        if (xNum == 0 && total == 0) {
            return "Infinite solutions";
        }
        if (xNum == 0 && total != 0) {
            return "No solution";
        }
        return "x=" + total / xNum;
    }


    public static Operation getOperation(String s) {
        String[] adds = s.split("\\+");
        int xNum = 0;
        int total = 0;
        for (int i = 0; i < adds.length; i++) {
            String add = adds[i];
            String[] subArray = add.split("-");
            if (subArray.length == 1) {
                if (add.contains("x")) {
                    String r = add.substring(0, add.indexOf("x"));
                    if (r.length() == 0) {
                        xNum++;
                    } else {
                        xNum += Integer.parseInt(r);
                    }
                } else {
                    total += Integer.parseInt(add);
                }
            } else {
                for (int j = 0; j < subArray.length; j++) {
                    String sub = subArray[j];
                    if(sub.isEmpty()){
                        continue;
                    }
                    if (j == 0) {
                        if (sub.contains("x")) {
                            String r = sub.substring(0, sub.indexOf("x"));
                            if (r.length() == 0) {
                                xNum++;
                            } else {
                                xNum += Integer.parseInt(r);
                            }
                        } else {
                            total += Integer.parseInt(sub);
                        }
                        continue;
                    }
                    if (sub.contains("x")) {
                        String r = sub.substring(0, sub.indexOf("x"));
                        if (r.length() == 0) {
                            xNum--;
                        } else {
                            xNum -= Integer.parseInt(r);
                        }
                    } else {
                        total -= Integer.parseInt(sub);
                    }
                }
            }
        }
        return new Operation(xNum, total);
    }


    static class Operation {

        int xNum;
        int total;

        public Operation(int xNum, int total) {
            this.xNum = xNum;
            this.total = total;
        }
    }
}
