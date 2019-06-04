import java.util.Stack;

/**
 * Given a list of daily temperatures T, return a list such that,
 * for each day in the input, tells you how many days you would
 * have to wait until a warmer temperature. If there is no future
 * day for which this is possible, put 0 instead.
 *
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] dist = new int[n];
        Stack<Integer> pre = new Stack<>();
        for (int curIndex = 0; curIndex < n; curIndex++){
            while (!pre.isEmpty() && T[curIndex] > T[pre.peek()]){
                int preIndex = pre.pop();
                dist[preIndex] = curIndex - preIndex;
            }
            pre.add(curIndex);
        }
        return dist;
    }
}
