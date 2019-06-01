/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 * Input: 1->2
 * Output: false
 *
 * Example 2:
 * Input: 1->2->2->1
 * Output: true
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) slow = slow.next;
        cut(head, slow);
        ListNode list = reverseList(slow);
        return isEqual(head, list);
    }
    public void cut(ListNode head, ListNode end){
        while (head.next != end){
            head = head.next;
        }
        head.next = null;
    }
    public ListNode reverseList(ListNode node){
        if (node == null || node.next == null)return node;
        ListNode pre = null;
        ListNode cur = node;
        ListNode next = node.next;
        while (cur != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if (cur != null){
                next = cur.next;
            }
        }return pre;
    }
    public boolean isEqual(ListNode l1, ListNode l2){
        while (l1 != null && l2 != null){
            if (l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

}
