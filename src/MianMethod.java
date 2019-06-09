import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: [2,2,1]
// * Output: 1
//                *
// * Example 2:
// * Input: [4,1,2,1,2]
// * Output: 4
        int[] num1 = {2,2,1};
        int[] num2 = {4,1,2,1,2};
        System.out.println(new SingleNbr().singleNumber(num1));
        System.out.println(new SingleNbr().singleNumber(num2));
    }
}
