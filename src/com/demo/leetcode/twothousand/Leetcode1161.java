package com.demo.leetcode.twothousand;

import com.demo.leetcode.datastruct.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1161 {
    private static  List<Integer> sum = new ArrayList<Integer>();
    public static int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int ans = 0;
        for (int i = 0; i < sum.size(); ++i) {
            if (sum.get(i) > sum.get(ans)) {
                ans = i;
            }
        }
        return ans + 1; // 层号从 1 开始
    }

    private static  void dfs(TreeNode node, int level) {
        if (level == sum.size()) {
            sum.add(node.val);
        } else {
            sum.set(level, sum.get(level) + node.val);
        }
        if (node.left != null) {
            dfs(node.left, level + 1);
        }
        if (node.right != null) {
            dfs(node.right, level + 1);
        }
    }


    public static void main(String[] args) {
//[1,7,0,7,-8,null,null]
        TreeNode treeNode = new TreeNode(1);
//        TreeNode l1 = new TreeNode(7);
//        TreeNode r1 = new TreeNode(0);
//        TreeNode l2 = new TreeNode(7);
//        TreeNode r2 = new TreeNode(-8);
//        treeNode.left = l1;
//        treeNode.right = r1;
//        l1.left = l2;
//        l1.right = r2;
        System.out.println(maxLevelSum(treeNode));
    }
}
