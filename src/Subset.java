import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++){
            backtracking(0, nums, combinations, combinationList, i);
        }
        return combinationList;
    }
    public void backtracking(int start, int[] nums, List<Integer> combinations, List<List<Integer>> combinationList, int size){
        if (size == combinations.size()){
            combinationList.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i < nums.length; i++){
            combinations.add(nums[i]);
            backtracking(i + 1, nums, combinations, combinationList, size);
            combinations.remove(combinations.size() - 1);
        }
    }
}
