import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * Note: A leaf is a node with no children.
 *
 * Example:
 * Input:
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null){
            return paths;
        }
        List<Integer> values = new ArrayList<>();
        backtracking(root, values, paths);
        return paths;
    }
    public void backtracking(TreeNode node, List<Integer> values, List<String> paths){
        if (node == null){
            return;
        }
        values.add(node.val);
        if (isLeaf(node)){
            paths.add(buildPath(values));
        }else{
            backtracking(node.left, values, paths);
            backtracking(node.right, values, paths);
        }
        values.remove(values.size() - 1);
    }
    public boolean isLeaf(TreeNode node){
        if (node.left == null && node.right == null){
            return true;
        }
        return false;
    }

    public String buildPath(List<Integer> values){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++){
            sb.append(values.get(i));
            if (i != values.size() - 1){
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
