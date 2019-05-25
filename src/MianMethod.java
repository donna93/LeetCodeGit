import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: [1,2,3,1]
// * Output: 4
//
// * Example 2:
// * Input: [2,7,9,3,1]
// * Output: 12
        int[] rob1 = {1,2,3,1};
        int[] rob2 = {2,7,9,3,1};
        System.out.println(new HouseRobber().rob(rob1));
        System.out.println(new HouseRobber().rob(rob2));
    }
}
