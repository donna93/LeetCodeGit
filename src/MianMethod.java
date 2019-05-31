import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
//// * Input:  [1,2,3,4]
//// * Output: [24,12,8,6]
        int[] input = {1,2,3,4};
        int[] output = new ProductOfArrayExceptSelf().productExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }
}
