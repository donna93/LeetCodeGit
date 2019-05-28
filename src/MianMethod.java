import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: coins = [1, 2, 5], amount = 11
//                * Output: 3
//                * Explanation: 11 = 5 + 5 + 1
//                *
// * Example 2:
// * Input: coins = [2], amount = 3
// * Output: -1
        int[] coins1 = {1, 2, 5};
        int[] coins2 = {2};
        System.out.println(new CoinChange().coinChange(coins1, 11));
        System.out.println(new CoinChange().coinChange(coins2, 3));
    }
}
