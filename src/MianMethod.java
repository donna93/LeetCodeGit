import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
// * Input: [1,2,3]
// * Output:
// * [
// *   [1,2,3],
// *   [1,3,2],
// *   [2,1,3],
// *   [2,3,1],
// *   [3,1,2],
// *   [3,2,1]
// * ]
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = new Permutations().permute(nums);
        System.out.println(list.toString());
    }
}
