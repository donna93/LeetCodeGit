import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 *
 * Example:
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        backtracking(n, k, 1, combinations, combinationList);
        return combinationList;
    }
    public void backtracking(int n, int k, int start, List<Integer> combinations, List<List<Integer>> combinationList){
        if (k == 0){
            combinationList.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i + k - 1 <= n; i++){
            combinations.add(i);
            backtracking(n, k - 1, i + 1, combinations, combinationList);
            combinations.remove(combinations.size() - 1);
        }
    }
}
