import java.util.PriorityQueue;

/**
 * Given a n x n matrix where each of the rows and columns are sorted
 * in ascending order, find the kth smallest element in the matrix.
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 *
 * Example:
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 *
 * return 13.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ n2.
 */
public class KthSmallestEleInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        int n = matrix.length, m = matrix[0].length;
        for (int j = 0; j < m; j++){
            pq.offer(new Tuple(0, j, matrix[0][j]));
        }
        for (int i = 0; i < k - 1; i++){
            Tuple t = pq.poll();
            if (t.val == n - 1) continue;
            pq.offer(new Tuple(t.x + 1, t.y, matrix[t.x + 1][t.y]));
        }
        return pq.poll().val;
    }
    class Tuple implements Comparable<Tuple>{
        int x, y, val;
        public Tuple(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
        @Override
        public int compareTo(Tuple that){
            return this.val - that.val;
        }
    }
    public int kthSmallest2(int[][] matrix, int k){
        int n = matrix.length, m = matrix[0].length;
        int low = matrix[0][0], high = matrix[n - 1][m - 1];
        while (low <= high){
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m && matrix[i][j] <= mid; j++){
                    cnt++;
                }
            }
            if (cnt < k)low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
