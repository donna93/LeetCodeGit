import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: 0000 0010 1001 0100 0001 1110 1001 1100
//                * Output: 0011 1001 0111 1000 0010 1001 0100 0000
//                * Explanation: The input binary string 00000010100101000001111010011100
//                * represents the unsigned integer 43261596, so return 964176192
//                * which its binary representation is 00111001011110000010100101000000.
//                *
// * Example 2:
// * Input: 11111111111111111111111111111101
//                * Output: 10111111111111111111111111111111
//                * Explanation: The input binary string 11111111111111111111111111111101
//                * represents the unsigned integer 4294967293, so return 3221225471
//                * which its binary representation is 10101111110010110010011101101001.
        System.out.println(new ReverseBits().reverseBits2(43261596));
//        System.out.println(new ReverseBits().reverseBits(11111111111111111111111111111101));
    }
}
