import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: 5
// * Output: 2
// * Explanation: The binary representation of 5 is 101 (no leading zero bits),
// * and its complement is 010. So you need to output 2.
//                *
// * Example 2:
// * Input: 1
// * Output: 0
        System.out.println(new NumberComplement().findComplement(5));
        System.out.println(new NumberComplement().findComplement2(5));
        System.out.println(new NumberComplement().findComplement3(5));

        System.out.println(new NumberComplement().findComplement(1));
        System.out.println(new NumberComplement().findComplement2(1));
        System.out.println(new NumberComplement().findComplement3(1));
    }
}
