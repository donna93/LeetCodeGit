import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example:
// * Given nums = [-2, 0, 3, -5, 2, -1]
// *
// * sumRange(0, 2) -> 1
//                * sumRange(2, 5) -> -1
//                * sumRange(0, 5) -> -3
        int[] num = {-2, 0, 3, -5, 2, -1};
        NumArray n = new NumArray(num);
        System.out.println(n.sumRange(0, 2));
        System.out.println(n.sumRange(2, 5));
        System.out.println(n.sumRange(0, 5));
    }
}
