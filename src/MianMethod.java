import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: candidates = [2,3,6,7], target = 7,
// * A solution set is:
// * [
// *   [7],
// *   [2,2,3]
// * ]
// *
// * Example 2:
// * Input: candidates = [2,3,5], target = 8,
// * A solution set is:
// * [
// *   [2,2,2,2],
// *   [2,3,3],
// *   [3,5]
// * ]

        int[] candidates = {2,3,6,7};
        List<List<Integer>> combinationList = new CombinationSum().combinationSum(candidates, 7);
        System.out.println(combinationList.toString());
    }
}
