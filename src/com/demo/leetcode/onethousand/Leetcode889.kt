package com.demo.leetcode.onethousand

import com.demo.leetcode.datastruct.TreeNode


fun main() {
    val root = constructFromPrePost(intArrayOf(1, 2, 4, 5, 3, 6, 7), intArrayOf(4, 5, 2, 6, 7, 3, 1))
    System.out.println("constructFromPrePost over")
}

fun constructFromPrePost(preorder: IntArray, postorder: IntArray): TreeNode? {
    val length = preorder.size
    if (length == 0) {
        return null
    }
    val root = TreeNode(preorder[0])
    if (length == 1) {
        return root
    }
    var l = 0
    for (i in 0 until length)
        if (postorder[i] == preorder[1])
            l = i + 1;

    root.left = constructFromPrePost(preorder.copyOfRange(1, l + 1),
            postorder.copyOfRange(0, l))
    root.right = constructFromPrePost(preorder.copyOfRange(l + 1, length),
            postorder.copyOfRange(l, length - 1))
    return root
}