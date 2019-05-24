import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
// *
// * Input: [1,1,2]
// * Output:
// * [
// *   [1,1,2],
// *   [1,2,1],
// *   [2,1,1]
// * ]
        int[] nums = {1, 1, 2};
        List<List<Integer>> permutesList = new PermutationII().permuteUnique(nums);
        System.out.println(permutesList.toString());
    }
}
