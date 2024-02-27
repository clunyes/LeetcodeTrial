import com.demo.leetcode.datastruct.TreeNode


fun main() {

}

fun isSymmetric(root: TreeNode?): Boolean {
    return check(root?.left, root?.right)
}


fun check(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) {
        return true
    }
    if (p == null || q == null) {
        return false
    }
    return p.`val` == q.`val` && check(p.left, q.right) && check(p.right, q.left)
}
