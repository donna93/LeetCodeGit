import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//
// * Example:
// * Input: n = 4, k = 2
//                * Output:
// * [
// *   [2,4],
// *   [3,4],
// *   [2,3],
// *   [1,2],
// *   [1,3],
// *   [1,4],
// * ]
        int[] nums = {1, 1, 2};
        List<List<Integer>> combinationList = new Combinations().combine(4, 2);
        System.out.println(combinationList.toString());
    }
}
