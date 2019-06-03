import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary search tree (BST) with duplicates, find all the mode(s)
 * (the most frequently occurred element) in the given BST.
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * For example:
 * Given BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 *
 * return [2].
 *
 * Note: If a tree has more than one mode, you can return them in any order.
 *
 * Follow up: Could you do that without using any extra space?
 * (Assume that the implicit stack space incurred due to recursion does not count).
 */
public class FindModeInBST {
    TreeNode preNode = null;
    int curCnt = 0;
    int maxCnt = 0;
    public int[] findMode(TreeNode root) {
        List<Integer> maxFrequent = new ArrayList<>();
        inorder(root, maxFrequent);
        int[] ret = new int[maxFrequent.size()];
        int cnt = 0;
        for (int num : maxFrequent){
            ret[cnt++] = num;
        }
        return ret;
    }
    public void inorder(TreeNode node, List<Integer> maxFrequent){
        if (node == null) return;
        inorder(node.left, maxFrequent);

        if (preNode != null){
            if (preNode.val == node.val) curCnt++;
            else curCnt = 1;
        }
        if (curCnt > maxCnt){
            maxFrequent.clear();
            maxCnt = curCnt;
        }else if (curCnt == maxCnt){
            maxFrequent.add(node.val);
        }
        preNode = node;
        inorder(node.right, maxFrequent);
    }
}
