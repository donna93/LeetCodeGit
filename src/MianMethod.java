import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example:
// * Input: nums = [1,2,3]
// * Output:
// * [
// *   [3],
// *   [1],
// *   [2],
// *   [1,2,3],
// *   [1,3],
// *   [2,3],
// *   [1,2],
// *   []
// * ]
        int[] nums = {1, 2, 3};
        List<List<Integer>> combinationList = new Subset().subsets(nums);
        System.out.println(combinationList.toString());
    }
}
