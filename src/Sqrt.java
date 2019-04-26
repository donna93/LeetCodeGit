/**
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example 1:
 * Input: 4
 * Output: 2
 *
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 *              the decimal part is truncated, 2 is returned.
 */
public class Sqrt {
    public static int mySqrt(int x) {
        int i = 1;
        int j = x;
        while(i <= j){
            int m = i + (j - i)/ 2;
            int sqrt = x / m;
            if(sqrt == m){
                return m;
            }else if(sqrt > m){
                i = m + 1;
            }else{
                j = m - 1;
            }
        }return j;
    }
}
