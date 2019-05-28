import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: nums is [1, 1, 1, 1, 1], S is 3.
//                * Output: 5
        int[] input = {1, 1, 1, 1, 1};
        System.out.println(new TargetSum().findTargetSumWays(input, 3));
    }
}
