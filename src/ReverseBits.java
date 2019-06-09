import java.util.HashMap;
import java.util.Map;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example 1:
 * Input: 0000 0010 1001 0100 0001 1110 1001 1100
 * Output: 0011 1001 0111 1000 0010 1001 0100 0000
 * Explanation: The input binary string 00000010100101000001111010011100
 * represents the unsigned integer 43261596, so return 964176192
 * which its binary representation is 00111001011110000010100101000000.
 *
 * Example 2:
 * Input: 11111111111111111111111111111101
 * Output: 10111111111111111111111111111111
 * Explanation: The input binary string 11111111111111111111111111111101
 * represents the unsigned integer 4294967293, so return 3221225471
 * which its binary representation is 10101111110010110010011101101001.
 *
 *
 * Note:
 * Note that in some languages such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as signed integer type
 * and should not affect your implementation, as the internal binary representation
 * of the integer is the same whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 above the input represents the signed integer -3
 * and the output represents the signed integer -1073741825.
 *
 * Follow up:
 * If this function is called many times, how would you optimize it?
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++){
            ret <<= 1;
            ret |= (n & 1);
            n >>= 1;
        }
        return ret;
    }
    private Map<Byte, Integer> cache = new HashMap<>();
    public int reverseBits2(int n){
        int ret = 0;
        for (int i = 0; i < 4; i++){
            ret <<= 8;
            ret |= reverseBits22((byte)(n & 0b11111111));
            n >>= 8;
        }
        return ret;
    }
    public int reverseBits22(byte b){
        if (cache.containsKey(b)) return cache.get(b);
        int ret = 0;
        int t = b;
        for (int i = 0; i < 8; i++){
            ret <<= 1;
            ret |= t & 1;
            t >>= 1;
        }
        cache.put(b, ret);
        return ret;
    }
}
