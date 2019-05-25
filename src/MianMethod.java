import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: 2
//                * Output: 2
//                * Explanation: There are two ways to climb to the top.
//                * 1. 1 step + 1 step
//                * 2. 2 steps
//                *
// * Example 2:
// * Input: 3
//                * Output: 3
//                * Explanation: There are three ways to climb to the top.
//                * 1. 1 step + 1 step + 1 step
//                * 2. 1 step + 2 steps
//                * 3. 2 steps + 1 step
        System.out.println(new ClimingStairs().climbStairs(2));
        System.out.println(new ClimingStairs().climbStairs(3));
    }
}
