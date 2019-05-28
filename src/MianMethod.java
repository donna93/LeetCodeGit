import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example:
// *
// * Input: [10,9,2,5,3,7,101,18]
// * Output: 4
        int[] input = {10,9,2,5,3,7,101,18};
        System.out.println(new LongIncreasingSubsequence().lengthOfLIS(input));
        System.out.println(new LongIncreasingSubsequence().lengthOfLIS2(input));
    }
}
