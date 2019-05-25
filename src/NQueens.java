import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
 * such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement,
 * where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * Example:
 * Input: 4
 * Output: [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */
public class NQueens {
    private List<List<String>> solutions;
    private boolean[] colUsed;
    private boolean[]diagonal45;
    private boolean[]diagonal135;
    private char[][] nQueens;
    int n;

    public List<List<String>> solveNQueens(int n) {
        solutions = new ArrayList<>();
        colUsed = new boolean[n];
        diagonal45 = new boolean[2 * n - 1];
        diagonal135 = new boolean[2 * n - 1];
        nQueens = new char[n][n];
        this.n = n;
        for (int i = 0; i < n; i++){
            Arrays.fill(nQueens[i], '.');
        }
        backtracking(0);
        return solutions;
    }
    public void backtracking(int row){
        if (row == n){
            List<String> list = new ArrayList<>();
            for (char[] c : nQueens){
                list.add(new String(c));
            }
            solutions.add(list);
        }
        for (int col = 0; col < n; col++){
            int diagonal45Idx = row + col;
            int diagonal135Idx = n - 1 - (row - col);
            if (colUsed[col] || diagonal45[diagonal45Idx] || diagonal135[diagonal135Idx]){
                continue;
            }
            colUsed[col] = diagonal45[diagonal45Idx] = diagonal135[diagonal135Idx] = true;
            nQueens[row][col] = 'Q';
            backtracking(row + 1);
            colUsed[col] = diagonal45[diagonal45Idx] = diagonal135[diagonal135Idx] = false;
            nQueens[row][col] = '.';
        }
    }
}
