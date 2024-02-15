package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.TreeNode


fun main() {
    val root = TreeNode(2)
    val l1 = TreeNode(1)
    val r1 = TreeNode(3)
    root.left = l1
    root.right = r1
    System.out.println(isValidBST(root))
}

fun isValidBST(root: TreeNode?): Boolean {
    val list: MutableList<Int> = mutableListOf()
    inorder(root, list)
    for (i in 0 until list.size - 1) {
        if (list[i] >= list[i + 1]) return false
    }
    return true
}

fun inorder(node: TreeNode?, list: MutableList<Int>) {
    if (node == null) return
    inorder(node.left, list)
    list.add(node.`val`)
    inorder(node.right, list)
}


