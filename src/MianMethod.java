import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
// * Input: [1,2,2]
// * Output:
// * [
// *   [2],
// *   [1],
// *   [1,2,2],
// *   [2,2],
// *   [1,2],
// *   []
// * ]
        int[] nums = {1, 2, 2};
        List<List<Integer>> combinationList = new SubsetII().subsetsWithDup(nums);
        System.out.println(combinationList.toString());
    }
}
