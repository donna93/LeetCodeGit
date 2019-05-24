import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of integers that might contain
 * duplicates, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 * Input: [1,2,2]
 * Output:
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 */
public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> combinationList = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i <= nums.length; i++){
            backtracking(0, combinations, combinationList, visited, nums, i);
        }
        return combinationList;
    }
    public void backtracking(int start, List<Integer> combinations, List<List<Integer>> combinationList,
                             boolean[] visited, int[] nums, int size){
        if (combinations.size() == size){
            combinationList.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i < nums.length; i++){
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]){
                continue;
            }
            visited[i] = true;
            combinations.add(nums[i]);
            backtracking(i + 1, combinations, combinationList, visited, nums, size);
            combinations.remove(combinations.size() - 1);
            visited[i] = false;
        }
    }
}
