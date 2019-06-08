import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input:
// * matrix = [
// *   [1,2,3,4],
// *   [5,1,2,3],
// *   [9,5,1,2]
// * ]
// * Output: True
//                * Explanation:
// * In the above grid, the diagonals are:
// * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//                * In each diagonal all elements are the same, so the answer is True.
// *
// * Example 2:
// * Input:
// * matrix = [
// *   [1,2],
// *   [2,2]
// * ]
// * Output: False
        int[][] matrix1 = {{1,2,3,4},
                            {5,1,2,3},
                            {9,5,1,2}};
        int[][] matrix2 = {{1, 2},
                           {2, 2}};
        System.out.println(new ToeplitzMatrix().isToeplitzMatrix(matrix1));
        System.out.println(new ToeplitzMatrix().isToeplitzMatrix(matrix2));
    }
}
