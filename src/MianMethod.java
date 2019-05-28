import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
// * Output: 4
// * Explanation: This are totally 4 strings can be formed by the using of 5 0s and 3 1s, which are “10,”0001”,”1”,”0”
// *
// *
// * Example 2:
// * Input: Array = {"10", "0", "1"}, m = 1, n = 1
// * Output: 2
        String[] strs = {"10", "0001", "111001", "1", "0"};
        String[] strs2 = {"10", "0", "1"};
        System.out.println(new OnesAndZeros().findMaxForm(strs, 5, 3));
        System.out.println(new OnesAndZeros().findMaxForm(strs2, 1, 1));
    }
}
