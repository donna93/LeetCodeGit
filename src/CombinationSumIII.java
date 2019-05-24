import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 *
 * Find all possible combinations of k numbers that add up to a number n,
 * given that only numbers from 1 to 9 can be used and each combination
 * should be a unique set of numbers.
 *
 * Note:
 * All numbers will be positive integers.
 * The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 *
 * Example 2:
 * Input: k = 3, n = 9
 * Output: [[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        backtracking(combinationList, combinations, k, n, 1);
        return combinationList;
    }
    public void backtracking(List<List<Integer>> combinationList, List<Integer> combinations, int k, int n, int start){
        if (k == 0 || n == 0){
            if (k == 0 && n == 0){
                combinationList.add(new ArrayList<>(combinations));
                return;
            }
            return;
        }

        for (int i = start; i <= 9; i++ ){
            if (i <= n){
                combinations.add(i);
                backtracking(combinationList, combinations, k - 1, n - i, i + 1);
                combinations.remove(combinations.size() - 1);
            }
        }
    }
}
