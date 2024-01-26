package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.TreeNode
import kotlin.math.max


fun main() {
    val root = TreeNode(3)
    val l1 = TreeNode(9)
    val r1 = TreeNode(20)
    val l2 = TreeNode(15)
    val r2 = TreeNode(7)
    root.left = l1
    root.right = r1
    r1.left = l2
    r1.right = r2
    System.out.println(maxDepth(root))
}

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val lval: Int = maxDepth(root.left)
    val rval: Int = maxDepth(root.right)
    return max(lval, rval) + 1
}