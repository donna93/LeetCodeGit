import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: 1
//                * Output: true
//                * Explanation: 20 = 1
//                *
// * Example 2:
// * Input: 16
//                * Output: true
//                * Explanation: 24 = 16
//                *
// * Example 3:
// * Input: 218
//                * Output: false
        System.out.println(new PowerOfTwo().isPowerOfTwo(1));
        System.out.println(new PowerOfTwo().isPowerOfTwo(16));
        System.out.println(new PowerOfTwo().isPowerOfTwo(218));

        System.out.println(new PowerOfTwo().isPowerOfTwo2(1));
        System.out.println(new PowerOfTwo().isPowerOfTwo2(16));
        System.out.println(new PowerOfTwo().isPowerOfTwo2(218));
    }
}
