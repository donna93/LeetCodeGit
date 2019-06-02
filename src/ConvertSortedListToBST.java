
/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 * Given the sorted linked list: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode preMid = preMidNode(head);
        ListNode Mid = preMid.next;
        preMid.next = null;
        TreeNode t = new TreeNode(Mid.val);
        t.left = sortedListToBST(head);
        t.right = sortedListToBST(Mid.next);
        return t;
    }
    public ListNode preMidNode(ListNode node){
        if (node == null) return null;
        ListNode ret = node;
        ListNode slow = node, fast = node.next;
        while (fast != null && fast.next != null){
            ret = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return ret;
    }
}
