import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: "12"
//                * Output: 2
//                * Explanation: It could be decoded as "AB" (1 2) or "L" (12).
//                *
// * Example 2:
// * Input: "226"
//                * Output: 3
        System.out.println(new DecodeWays().numDecodings("12"));
        System.out.println(new DecodeWays().numDecodings("226"));
    }
}
