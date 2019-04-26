import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a positive integer n, find the least number of perfect square
 * numbers (for example, 1, 4, 9, 16, ...) which sum to n.
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
public class PerfectSquares {
    public static int numSquares(int n) {
        List<Integer> squares = generateSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        boolean[] marked = new boolean[n + 1];
        marked[n] = true;
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            while (size-- > 0){
                int cur = queue.poll();
                for(int s : squares){
                    int next = cur - s;
                    if(next < 0)
                        break;
                    if(next == 0)
                        return level;
                    if(marked[next])
                        continue;
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }return -1;
    }
    public static List<Integer> generateSquares(int n){
        List<Integer> squares = new ArrayList<>();
        int s = 1;
        int diff = 3;
        while(s <= n){
            squares.add(s);
            s += diff;
            diff += 2;
        }return squares;
    }
}
