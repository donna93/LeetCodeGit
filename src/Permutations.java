import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> permutes = new ArrayList<>();
        List<List<Integer>> permuteList = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(permutes, permuteList, visited, nums);
        return permuteList;
    }
    public void backtracking(List<Integer> permutes, List<List<Integer>> permuteList, boolean[] visited, int[] nums){
        if (permutes.size() == nums.length){
            permuteList.add(new ArrayList<>(permutes));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            permutes.add(nums[i]);
            backtracking(permutes, permuteList, visited, nums);
            permutes.remove(permutes.size() - 1);
            visited[i] = false;
        }
    }
}
