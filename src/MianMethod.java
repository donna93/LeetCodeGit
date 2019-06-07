import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: n = 3, k = 1
// * Output: [1, 2, 3]
// * Explanation: The [1, 2, 3] has three different
// * positive integers ranging from 1 to 3, and the [1, 1] has exactly 1 distinct integer: 1.
// *
// * Example 2:
// * Input: n = 3, k = 2
// * Output: [1, 3, 2]
// * Explanation: The [1, 3, 2] has three different
// * positive integers ranging from 1 to 3, and the [2, 1] has exactly 2 distinct integers: 1 and 2.
        int[] ret1 = new BeautifulArragement().constructArray(3, 1);
        System.out.println(Arrays.toString(ret1));
        int[] ret2 = new BeautifulArragement().constructArray(3, 2);
        System.out.println(Arrays.toString(ret2));
    }
}
