import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: [1, 2, 2, 3, 1]
// * Output: 2
//                * Explanation:
// * The input array has a degree of 2 because both elements 1 and 2 appear twice.
// * Of the subarrays that have the same degree:
// * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
// * The shortest length is 2. So return 2.
//                *
// * Example 2:
// * Input: [1,2,2,3,1,4,2]
// * Output: 6
        int[] input1 = {1, 2, 2, 3, 1};
        int[] input2 = {1,2,2,3,1,4,2};
        System.out.println(new DegreeOfArray().findShortestSubArray(input1));
        System.out.println(new DegreeOfArray().findShortestSubArray(input2));
    }
}
