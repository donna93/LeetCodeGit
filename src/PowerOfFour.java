/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example 1:
 * Input: 16
 * Output: true
 *
 * Example 2:
 * Input: 5
 * Output: false
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        return (num & ( num - 1)) == 0 && (num & 0b01010101010101010101010101010101) != 0;
    }
    public boolean isPowerOfFour2(int num) {
        if (num <= 0) return false;
        return Integer.toString(num, 4).matches("10*");
    }
}
