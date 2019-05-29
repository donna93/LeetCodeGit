import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: [2,4,1], k = 2
//                * Output: 2
//                * Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
//                *
// * Example 2:
// * Input: [3,2,6,5,0,3], k = 2
//                * Output: 7
        int[] input1 = {2,4,1};
        int[] input2 = {3,2,6,5,0,3};
        System.out.println(new BestTimeToBuySellStockIV().maxProfit(2, input1));
        System.out.println(new BestTimeToBuySellStockIV().maxProfit(2, input2));
    }
}
