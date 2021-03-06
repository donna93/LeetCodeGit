import java.util.Arrays;

/**
 * Given an integer array with all positive numbers and no duplicates,
 * find the number of possible combinations that add up to a positive integer target.
 *
 * Example:
 * nums = [1, 2, 3]
 * target = 4
 *
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 *
 * Note that different sequences are counted as different combinations.
 *
 * Therefore the output is 7.
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        int[] maximum = new int[target + 1];
        maximum[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= target; i++){
            for (int j = 0; j < nums.length && nums[j] <= i; j++){
                maximum[i] += maximum[i - nums[j]];
            }
        }
        return maximum[target];
    }
}
