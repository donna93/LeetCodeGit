/**
 * Given an array of numbers nums, in which exactly two elements appear
 * only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 *
 * Example:
 * Input:  [1,2,1,3,2,5]
 * Output: [3,5]
 *
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingleNbrII {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int n : nums) diff ^= n;
        diff &= -diff;
        int[] ret = new int[2];
        for (int n : nums){
            if ((diff & n) == 0) ret[0] ^= n;
            else ret[1] ^= n;
        }
        return ret;
    }
}
