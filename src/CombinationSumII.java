import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 * Each number in candidates may only be used once in the combination.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 *
 * Example 2:
 * Input: candidates = [2,5,2,1,2], target = 5,
 * A solution set is:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] visited = new boolean[candidates.length];
        backtracking(combinations, combinationList, 0, candidates, target, visited);
        return combinationList;
    }
    public void backtracking(List<Integer> combinations, List<List<Integer>> combinationList,
                             int start, int[] candidates, int target, boolean[] visited){
        if (target == 0){
            combinationList.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i < candidates.length; i++){
            if (i != 0 && !visited[i - 1] && candidates[i] == candidates[i - 1]){
                continue;
            }
            if (target >= candidates[i]){
                visited[i] = true;
                combinations.add(candidates[i]);
                backtracking(combinations, combinationList, i + 1, candidates, target - candidates[i], visited);
                combinations.remove(combinations.size() - 1);
                visited[i] = false;
            }
        }
    }
}
