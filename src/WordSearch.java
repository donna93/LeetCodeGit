/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * Example:
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */
public class WordSearch {
    private int m, n;
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0){
            return false;
        }
        if (word == null || word.length() == 0){
            return true;
        }
        m = board.length;
        n = board[0].length;
        boolean[][] hasvisited = new boolean[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (backtracking(0, i, j, hasvisited, board, word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtracking(int curLen, int r, int c, boolean[][] visited, char[][] board, String word){
        if (curLen == word.length()){
            return true;
        }
        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || board[r][c] != word.charAt(curLen)){
            return false;
        }
        visited[r][c] = true;
        for (int[] d :direction){
            if (backtracking(curLen + 1, r + d[0], c + d[1], visited, board, word)){
                return true;
            }
        }
        visited[r][c] = false;
        return false;
    }
}
