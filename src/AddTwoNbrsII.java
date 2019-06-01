import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * Example:
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNbrsII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = new Stack();
        Stack<Integer> l2Stack = new Stack();
        while (l1 != null){
            l1Stack.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            l2Stack.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = new ListNode(-1);
        int carry = 0;
        while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0){
            int x = l1Stack.isEmpty() ? 0 : l1Stack.pop();
            int y = l2Stack.isEmpty() ? 0 : l2Stack.pop();
            int sum = x + y + carry;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }
        return head.next;
    }
}
