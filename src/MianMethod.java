import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: [2,3,2]
// * Output: 3
//                * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
// *              because they are adjacent houses.
//                *
// * Example 2:
// * Input: [1,2,3,1]
// * Output: 4
//                * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//                *              Total amount you can rob = 1 + 3 = 4.
        int[] rob1 = {2, 3, 2};
        int[] rob2 = {1, 2, 3, 1};
        System.out.println(new HouseRobberII().rob(rob1));
        System.out.println(new HouseRobberII().rob(rob2));
    }
}
