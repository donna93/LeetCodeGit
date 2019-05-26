import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: 2
// * Output: 1
// * Explanation: 2 = 1 + 1, 1 × 1 = 1.
//                *
// * Example 2:
// * Input: 10
// * Output: 36
// * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
        System.out.println(new IntegerBreak().integerBreak(2));
        System.out.println(new IntegerBreak().integerBreak(10));
    }
}
