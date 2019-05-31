/**
 *
 */
public class ReverseLinedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        while (cur != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if (cur != null){
                next = cur.next;
            }
        }
        return pre;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
