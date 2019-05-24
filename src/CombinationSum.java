import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates)
 * and a target number (target), find all unique combinations in
 * candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * Example 2:
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        backtracking(combinationList, combinations, 0, target, candidates);
        return combinationList;
    }
    public void backtracking(List<List<Integer>> combinationList, List<Integer> combinations, int start, int target, int[] candidate){
        if (target == 0){
            combinationList.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i < candidate.length; i++){
            if (target >= candidate[i]){
                combinations.add(candidate[i]);
                backtracking(combinationList, combinations, i, target - candidate[i], candidate);
                combinations.remove(combinations.size() - 1);
            }
        }
    }
}
