import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: [3,3,5,0,0,3,1,4]
// * Output: 6

// * Example 2:
// * Input: [1,2,3,4,5]
// * Output: 4
// *
// * Example 3:
// * Input: [7,6,4,3,1]
// * Output: 0
        int[] input1 = {3,3,5,0,0,3,1,4};
        int[] input2 = {1,2,3,4,5};
        int[] input3 = {7,6,4,3,1};
        System.out.println(new BestTimeToBuySellStockIII().maxProfit(input1));
        System.out.println(new BestTimeToBuySellStockIII().maxProfit(input2));
        System.out.println(new BestTimeToBuySellStockIII().maxProfit(input3));
    }
}
