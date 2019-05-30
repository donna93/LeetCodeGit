import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: 3
// * Output: 0
// * Explanation: 3! = 6, no trailing zero.
// *
// * Example 2:
// * Input: 5
// * Output: 1
// * Explanation: 5! = 120, one trailing zero.

        System.out.println(new FactorialTrailingZeroes().trailingZeroes(3));
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(5));
    }
}
