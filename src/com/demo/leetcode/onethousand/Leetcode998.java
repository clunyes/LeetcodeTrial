package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.TreeNode;

public class Leetcode998 {

    public static TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (val > root.val) return new TreeNode(val, root, null);

        TreeNode parent = root, cursor = root.right;
        while (cursor != null && val < cursor.val) {
            parent = cursor;
            cursor = cursor.right;
        }
        parent.right = new TreeNode(val, cursor, null);
        return root;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(1);
        root.left = l1;
        root.right = r1;
        l1.right = r2;
        TreeNode node = insertIntoMaxTree(root, 4);
        System.out.println("end");
    }

}
