import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: 5
// * Output: True
// * Explanation:
// * The binary representation of 5 is: 101
//                *
// * Example 2:
// * Input: 7
// * Output: False
// * Explanation:
// * The binary representation of 7 is: 111.
// *
// * Example 3:
// * Input: 11
// * Output: False
// * Explanation:
// * The binary representation of 11 is: 1011.
//                *
// * Example 4:
// * Input: 10
// * Output: True
// * Explanation:
        System.out.println(new BinaryNbrWithAlternatingBits().hasAlternatingBits(5));
        System.out.println(new BinaryNbrWithAlternatingBits().hasAlternatingBits(7));
        System.out.println(new BinaryNbrWithAlternatingBits().hasAlternatingBits(11));
        System.out.println(new BinaryNbrWithAlternatingBits().hasAlternatingBits(10));
    }
}
