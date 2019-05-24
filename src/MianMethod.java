import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: candidates = [10,1,2,7,6,1,5], target = 8,
// * A solution set is:
// * [
// *   [1, 7],
// *   [1, 2, 5],
// *   [2, 6],
// *   [1, 1, 6]
// * ]
// *
// * Example 2:
// * Input: candidates = [2,5,2,1,2], target = 5,
// * A solution set is:
// * [
// *   [1,2,2],
// *   [5]
// * ]

        int[] candidates = {10,1,2,7,6,1,5};
        int[] candidates2 = {2,5,2,1,2};

        List<List<Integer>> combinationList = new CombinationSumII().combinationSum2(candidates, 8);
        System.out.println(combinationList.toString());

        List<List<Integer>> combinationList2 = new CombinationSumII().combinationSum2(candidates2, 5);
        System.out.println(combinationList2.toString());
    }
}
