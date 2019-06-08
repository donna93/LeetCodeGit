import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: arr = [4,3,2,1,0]
// * Output: 1
//                * Explanation:
// * Splitting into two or more chunks will not return the required result.
// * For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
//                *
// * Example 2:
// * Input: arr = [1,0,2,3,4]
// * Output: 4
        int[] input1 = {4,3,2,1,0};
        int[] input2 = {1,0,2,3,4};
        System.out.println(new MaxChunksToMakeSorted().maxChunksToSorted(input1));
        System.out.println(new MaxChunksToMakeSorted().maxChunksToSorted(input2));
    }
}
