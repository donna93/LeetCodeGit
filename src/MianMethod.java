import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: [1,7,4,9,2,5]
// * Output: 6
// * Explanation: The entire sequence is a wiggle sequence.
// *
// * Example 2:
// * Input: [1,17,5,10,13,15,10,5,16,8]
// * Output: 7
        int[] input = {1,7,4,9,2,5};
        int[] input2 = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(new WiggleSubsequence().wiggleMaxLength(input));
        System.out.println(new WiggleSubsequence().wiggleMaxLength(input2));
    }
}
