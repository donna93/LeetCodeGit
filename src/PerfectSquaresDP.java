import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 *
 * Example 1:
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 *
 * Example 2:
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */
public class PerfectSquaresDP {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        List<Integer> squaresList = generateSquares(n);
        for (int i = 1; i <= n; i++){
            int min = Integer.MAX_VALUE;
            for (int squares : squaresList){
                if (i < squares){
                    break;
                }
                min = Math.min(min, dp[i - squares] + 1);
            }
            dp[i] = min;
        }
        return dp[n];
    }
    public List<Integer> generateSquares(int n){
        List<Integer> squareList = new ArrayList<>();
        int diff = 2;
        int square = 1;
        while(square < n){
            squareList.add(square);
            diff += 2;
            square += diff;
        }
        return squareList;
    }
}
