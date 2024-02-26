import com.demo.leetcode.datastruct.TreeNode

fun main() {
    val root = TreeNode(10)
    val l1 = TreeNode(5)
    val r1 = TreeNode(15)
    val l1l1 = TreeNode(3)
    val l1r1 = TreeNode(7)
    val r1r2 = TreeNode(18)
    root.left = l1
    root.right = r1
    l1.left = l1l1
    l1.right = l1r1
    r1.right = r1r2
    System.out.println(rangeSumBST(root, 7, 15))
}

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    if (root == null) {
        return 0
    }
    val nodeValue = rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    if (root.`val` in low..high) {
        return root.`val` + nodeValue
    }
    return nodeValue
}