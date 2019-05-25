import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example:
// * Input: 4
//                * Output: [
// *  [".Q..",  // Solution 1
// *   "...Q",
// *   "Q...",
// *   "..Q."],
// *
// *  ["..Q.",  // Solution 2
// *   "Q...",
// *   "...Q",
// *   ".Q.."]
// * ]
        List<List<String>> solution = new NQueens().solveNQueens(4);
        System.out.println(solution.toString());
    }
}
