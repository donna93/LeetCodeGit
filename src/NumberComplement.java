/**
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.
 *
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 *
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 *
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits),
 * and its complement is 0. So you need to output 0.
 */
public class NumberComplement {
    public int findComplement(int num) {
        int mask = 1 << 30;
        while ((mask & num) == 0) mask >>= 1;
        mask = (mask << 1) - 1;
        return mask ^ num;
    }
    public int findComplement2(int num){
        int mask = Integer.highestOneBit(num);
        mask = (mask << 1) - 1;
        return mask ^ num;
    }
    public int findComplement3(int num){
        int mask = num;
        mask |= mask >> 1;
        mask |= mask >> 2;
        mask |= mask >> 4;
        mask |= mask >> 8;
        mask |= mask >> 16;
        return mask ^ num;
    }
}
