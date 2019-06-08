import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: [[1,2], [1,3], [2,3]]
// * Output: [2,3]
// * Explanation: The given undirected graph will be like this:
// *   1
//                *  / \
// * 2 - 3
//                *
// * Example 2:
// * Input: [[1,2], [2,3], [3,4], [1,4], [1,5]]
// * Output: [1,4]
        int[][] input1 = {
                {1, 2},
                {1, 3},
                {2, 3}
        };
        int[][] input2 = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };
        int[] out1 = new RedundantConnection().findRedundantConnection(input1);
        int[] outf2 = new RedundantConnection().findRedundantConnection(input2);
        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(outf2));
    }
}
