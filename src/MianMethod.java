import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: 2
//                * Output: [0,1,1]
// *
// * Example 2:
// * Input: 5
//                * Output: [0,1,1,2,1,2]
        int[] output1 = new CountingBits().countBits(2);
        System.out.println(Arrays.toString(output1));

        int[] output2 = new CountingBits().countBits(5);
        System.out.println(Arrays.toString(output2));
    }
}
