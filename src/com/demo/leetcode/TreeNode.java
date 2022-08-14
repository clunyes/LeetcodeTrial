package com.demo.leetcode;

import com.demo.leftgod.TreePrintUtil;

public class TreeNode implements TreePrintUtil.TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public TreePrintUtil.TreeNode getLeftChild() {
        return this.left;
    }

    @Override
    public TreePrintUtil.TreeNode getRightChild() {
        return this.right;
    }

    @Override
    public String toString() {
        return "[" + this.val + "]";
    }
}
