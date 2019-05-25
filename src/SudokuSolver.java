/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 *
 * A sudoku solution must satisfy all of the following rules:
 *
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * Empty cells are indicated by the character '.'.
 *
 * Example:
 *  char[][] a = {
 *         {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
 *         {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
 *         {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
 *         {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
 *         {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
 *         {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
 *         {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
 *         {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
 *         {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
 *
 *     char[][] b = {
 *         {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
 *         {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
 *         {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
 *         {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
 *         {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
 *         {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
 *         {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
 *         {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
 *         {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
 */

public class SudokuSolver {
    private boolean[][] rowUsed = new boolean[9][10];
    private boolean[][] colUsed = new boolean[9][10];
    private boolean[][] cubeUsed = new boolean[9][10];
    private char[][] board;

    public void solveSudoku(char[][] board) {
        this.board = board;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int nums = board[i][j] - '0';
                rowUsed[i][nums] = true;
                colUsed[j][nums] = true;
                cubeUsed[cubeNum(i, j)][nums] = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                backtracking(i, j);
            }
        }
    }
    public boolean backtracking(int row, int col){
        while(row < 9 && board[row][col] != '.'){
            row = col == 8 ? row + 1 : row;
            col = col == 8 ? 0 : col + 1;
        }
        if (row == 9){
            return true;
        }
        for (int num = 1; num <= 9; num++){
            if (rowUsed[row][num] || colUsed[col][num] || cubeUsed[cubeNum(row, col)][num]){
                continue;
            }
            rowUsed[row][num] = colUsed[col][num] = cubeUsed[cubeNum(row, col)][num] = true;
            board[row][col] = (char)(num + '0');
            if (backtracking(row, col)){
                return true;
            }
            board[row][col] = '.';
            rowUsed[row][num] = colUsed[col][num] = cubeUsed[cubeNum(row, col)][num] = false;
        }
        return false;
    }
    public int cubeNum(int i, int j){
        int r = i / 3;
        int c = j / 3;
        return r * 3 + c;
    }
}
