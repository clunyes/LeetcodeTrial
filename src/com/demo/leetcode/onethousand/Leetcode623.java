package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.TreeNode;
import com.demo.leftgod.TreePrintUtil;

import java.util.Arrays;

public class Leetcode623 {
    private static int targetDepth = 1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        root.left = l1;
        root.right = r1;
        l1.left = l2;
        addOneRow(root, 5, 4);
        TreePrintUtil.show(root);
    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        targetDepth = depth;
        if (targetDepth == 1) {
            return new TreeNode(val, root, null);
        } else {
            add(root, val, 1);
        }
        return root;
    }

    private static void add(TreeNode root, int val, int depth) {
        if (root.left != null || root.right != null) {
            depth++;
            if (depth == targetDepth) {
                TreeNode newL = new TreeNode(val, null, null);
                if (root.left != null) {
                    newL.left = root.left;
                }
                root.left = newL;
                TreeNode newR = new TreeNode(val, null, null);
                if (root.right != null) {
                    newR.right = root.right;
                }
                root.right = newR;
            } else {
                if (root.left != null) {
                    add(root.left, val, depth);
                }
                if (root.right != null) {
                    add(root.right, val, depth);
                }
            }
        } else {
            depth++;
            if (depth == targetDepth) {
                root.left = new TreeNode(val, null, null);
                root.right = new TreeNode(val, null, null);
            }
        }
    }

}
