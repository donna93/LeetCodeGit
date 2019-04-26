/**
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 *
 * Example 1:
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Given the above grid, return 6.
 * Note the answer is not 11, because the island must be connected 4-directionally.
 *
 * Example 2:
 * [[0,0,0,0,0,0,0,0]]
 * Given the above grid, return 0.
 */
public class MaxAreaOfIsland {
    private static int[][] direction = new int[][]{{1, 0},{-1, 0},{0, 1},{0, -1}};
    public static int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid == null || grid[0].length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;
    }
    public static int dfs(int[][] grid, int r, int c){
        int m = grid.length;
        int n = grid[0].length;
        if(r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0)
            return 0;
        int area = 1;
        grid[r][c] = 0;
        for(int[] d :direction){
            area += dfs(grid, r + d[0], c + d[1]);
        }
        return area;
    }
}
