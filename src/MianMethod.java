import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
// * Input:
// * [
// *   [1,3,1],
// *   [1,5,1],
// *   [4,2,1]
// * ]
// * Output: 7
        int[][] input = {
                {1,3,1},
                {1,5,1},
                {4,2,1},
        };
        System.out.println(new MinimumPathSum().minPathSum(input));
    }
}
