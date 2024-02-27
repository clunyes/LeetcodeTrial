import com.demo.leetcode.datastruct.ListNode

fun main() {

}

fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) {
        return false
    }
    var slow: ListNode? = head
    var fast: ListNode? = head.next
    while (slow != fast) {
        if (fast?.next == null) {
            return false
        }
        slow = slow?.next
        fast = fast?.next?.next
    }
    return true
}