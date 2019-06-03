/**
 * Given a binary search tree with non-negative values,
 * find the minimum absolute difference between values of any two nodes.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * Output:
 * 1
 *
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 */
public class MinimumAbsoluteDiffInBST {
    int minDiff = Integer.MAX_VALUE;
    TreeNode prenode = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    public void inorder(TreeNode node){
        if (node == null)return;
        inorder(node.left);
        if (prenode != null) minDiff = Math.min(minDiff, prenode.val - node.val);
        prenode = node;
        inorder(node.right);
    }
}
