package com.demo.leetcode.onethousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Leetcode36 {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Integer>> mapRow = new HashMap<>();
        Map<Integer, HashSet<Integer>> mapCol = new HashMap<>();
        Map<Integer, HashSet<Integer>> mapCell = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char e = board[i][j];
                if (e == '.') {
                } else {
                    HashSet set;
                    if (mapRow.containsKey(i)) {
                        set = mapRow.get(i);
                        if (set.contains(e)) {
                            return false;
                        } else {
                            set.add(e);
                        }
                    } else {
                        set = new HashSet<>();
                        set.add(e);
                    }
                    mapRow.put(i, set);

                    HashSet setC;
                    if (mapCol.containsKey(j)) {
                        setC = mapCol.get(j);
                        if (setC.contains(e)) {
                            return false;
                        } else {
                            setC.add(e);
                        }
                    } else {
                        setC = new HashSet<>();
                        setC.add(e);
                    }
                    mapCol.put(j, setC);

                    HashSet setCell;
                    int cIndex = getCellIndex(i, j);
                    if (mapCell.containsKey(cIndex)) {
                        setCell = mapCell.get(cIndex);
                        if (setCell.contains(e)) {
                            return false;
                        } else {
                            setCell.add(e);
                        }
                    } else {
                        setCell = new HashSet<>();
                        setCell.add(e);
                    }
                    mapCell.put(cIndex, setCell);
                }
            }
        }
        return result;
    }


    private static int getCellIndex(int i, int j) {
        int result = 0;
        if (i < 3) {
            if (j < 3) {
                result = 1;
            } else if (j < 6) {
                result = 4;
            } else {
                result = 7;
            }
        } else if (i < 6) {
            if (j < 3) {
                result = 2;
            } else if (j < 6) {
                result = 5;
            } else {
                result = 8;
            }
        } else {
            if (j < 3) {
                result = 3;
            } else if (j < 6) {
                result = 6;
            } else {
                result = 9;
            }
        }
        return result;
    }
}
