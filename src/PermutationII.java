import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * Example:
 *
 * Input: [1,1,2]
 * Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class PermutationII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permuteList = new ArrayList<>();
        List<Integer> permute = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(permute, permuteList, visited, nums);
        return permuteList;
    }
    public void backtracking(List<Integer> permutes, List<List<Integer>> permuteList, boolean[] visited, int[] nums){
        if (permutes.size() == nums.length){
            permuteList.add(new ArrayList<>(permutes));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]){
                continue;
            }
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
