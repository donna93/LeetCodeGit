import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example:
// * Input:  [1,2,1,3,2,5]
// * Output: [3,5]
        int[] num1 = {1,2,1,3,2,5};
//        int[] num2 = {9,6,4,2,3,5,7,0,1};
        int[] out = new SingleNbrII().singleNumber(num1);
        System.out.println(Arrays.toString(out));
    }
}
