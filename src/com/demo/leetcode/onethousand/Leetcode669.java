package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.TreeNode;

public class Leetcode669 {

    public static void main(String[] args) {
    }

    /**
     * 直接过，厉害
     * @param root
     * @param low
     * @param high
     * @return
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        //满足条件
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
