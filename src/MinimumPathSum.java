/**
 * Given a m x n grid filled with non-negative numbers, find a path from
 * top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid == null){
            return 0;
        }
        int[] dp = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (j == 0){
                    dp[j] = dp[j];
                }else if (i == 0){
                    dp[j] = dp[j - 1];
                }else{
                    dp[j] = Math.min(dp[j - 1], dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[grid.length - 1];
    }
}
