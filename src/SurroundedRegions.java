/**
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *
 * Example:
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 *
 * After running your function, the board should be:
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 */
public class SurroundedRegions {
    private static int[][] direction = new int[][]{{0, 1},{0, -1},{1, 0},{-1, 0}};
    private static int m, n;
    public static void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0 || board == null)
            return;
        m = board.length;
        n = board[0].length;
        for(int i = 0; i < m; i++){
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }
        for(int i = 0; i < n; i++){
            dfs(board, 0, i);
            dfs(board, m - 1, i);
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
    public static void dfs(char[][] board, int r, int c){
        if(r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'T';
        for(int[] d : direction){
            dfs(board, r + d[0], c + d[1]);
        }
    }
}
