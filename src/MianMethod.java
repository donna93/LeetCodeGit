import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: [[1,2], [2,3], [3,4]]
// * Output: 2
        int[][] paris = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(new MaxLenOfPairChain().findLongestChain(paris));
    }
}
