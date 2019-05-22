import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.
 *
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
 *
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 *
 * Note:
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 *
 * Example:
 * Given the following 5x5 matrix:
 *   Pacific ~   ~   ~   ~   ~
 *        ~  1   2   2   3  (5) *
 *        ~  3   2   3  (4) (4) *
 *        ~  2   4  (5)  3   1  *
 *        ~ (6) (7)  1   4   5  *
 *        ~ (5)  1   1   2   4  *
 *           *   *   *   *   * Atlantic
 *
 * Return:
 *
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 */
public class PacificAltlanticWaterFlow {
    private int m, n;
    private int[][] matrix;
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<int[]> pacificAtlantic(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        List<int[]> ret = new ArrayList<>();

        this.matrix = matrix;
        boolean[][] canReachA = new boolean[m][n];
        boolean[][] canReachP = new boolean[m][n];

        for(int i = 0; i < m; i++){
            dfs(i, 0, canReachA);
            dfs(i, n - 1, canReachP);
        }

        for(int i = 0; i < n; i++){
            dfs(0, i, canReachA);
            dfs(m - 1, i, canReachP);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(canReachA[i][j] && canReachP[i][j]){
                    ret.add(new int[]{i, j});
                }
            }
        }
        return ret;
    }
    public void dfs(int r, int c, boolean[][] canReach){
        if(canReach[r][c]){
            return;
        }
        canReach[r][c] = true;
        for(int[] d : direction){
            int nextR = r + d[0];
            int nextC = c + d[1];
            if(nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || matrix[r][c] > matrix[nextR][nextC]){
                continue;
            }
            dfs(nextR, nextC, canReach);
        }
    }
}
