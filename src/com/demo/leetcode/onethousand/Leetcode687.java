package com.demo.leetcode.onethousand;

import com.demo.leetcode.datastruct.TreeNode;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Stack;

public class Leetcode687 {

    public static void main(String[] args) {

    }


    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root) {
        if (root == null) return 0;
        int ans = 0, cur = 0, l = dfs(root.left), r = dfs(root.right);
        if (root.left != null && root.left.val == root.val) {
            ans = l + 1; cur += l + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            ans = Math.max(ans, r + 1); cur += r + 1;
        }
        max = Math.max(max, cur);
        return ans;
    }

}