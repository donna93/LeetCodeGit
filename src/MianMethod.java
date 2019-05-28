import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: [1, 5, 11, 5]
// * Output: true
//                * Explanation: The array can be partitioned as [1, 5, 5] and [11].
//                *
// *
// * Example 2:
// * Input: [1, 2, 3, 5]
// * Output: false
        int[] input1 = {1, 5, 11, 5};
        int[] input2 = {1, 2, 3, 5};
        System.out.println(new PartitionEqualSubsetSum().canPartition(input1));
        System.out.println(new PartitionEqualSubsetSum().canPartition(input2));
    }
}
