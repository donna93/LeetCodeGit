import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: [3,0,1]
// * Output: 2
//                *
// * Example 2:
// * Input: [9,6,4,2,3,5,7,0,1]
// * Output: 8
        int[] num1 = {3,0,1};
        int[] num2 = {9,6,4,2,3,5,7,0,1};
        System.out.println(new MissingNumber().missingNumber(num1));
        System.out.println(new MissingNumber().missingNumber(num2));
    }
}
