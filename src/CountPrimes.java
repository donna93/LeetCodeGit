/**
 * Count the number of prime numbers less than a non-negative number, n.
 *
 *
 Example:
 * Input: 10
 * Output: 4 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++){
            if (notPrimes[i]){
                continue;
            }
            count++;
            for (long j = (long) (i) * i; j < n; j += i){
                notPrimes[(int)j] = true;
            }
        }
        return count;
    }
}
