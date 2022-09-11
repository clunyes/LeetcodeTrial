package com.demo.leetcode.onethousand;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int mSize = matrix.length * matrix[0].length;
        int leftC = 0, rightC = matrix[0].length - 1;
        int topRow = 0, endRow = matrix.length - 1;
        int curRow = 0, curColumn = 0;
        result.add(matrix[curRow][curColumn]);
        int direction = 0;//0 从左往右，1 从上往下，2 从右往左，3从下往上
        while (mSize != result.size()) {
            switch (direction) {
                case 0:
                    curColumn++;
                    break;
                case 1:
                    curRow++;
                    break;
                case 2:
                    curColumn--;
                    break;
                case 3:
                    curRow--;
                    break;
            }
            if (curRow <= endRow && curRow >= topRow
                    && curColumn <= rightC && curColumn >= leftC) {

                result.add(matrix[curRow][curColumn]);
            } else {
                switch (direction) {
                    case 0:
                        curColumn--;
                        direction++;
                        topRow++;
                        break;
                    case 1:
                        curRow--;
                        direction++;
                        rightC--;
                        break;
                    case 2:
                        curColumn++;
                        direction++;
                        endRow--;
                        break;
                    case 3:
                        curRow++;
                        direction = 0;
                        leftC++;
                        break;
                }
            }
        }
        return result;
    }
}
