import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: k = 3, n = 7
// * Output: [[1,2,4]]
// *
// * Example 2:
// * Input: k = 3, n = 9
// * Output: [[1,2,6], [1,3,5], [2,3,4]]

        List<List<Integer>> combinationList = new CombinationSumIII().combinationSum3(3, 7);
        System.out.println(combinationList.toString());

        List<List<Integer>> combinationList2 = new CombinationSumIII().combinationSum3(3, 9);
        System.out.println(combinationList2.toString());
    }
}
