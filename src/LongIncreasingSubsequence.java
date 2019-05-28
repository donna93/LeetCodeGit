/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 *
 * Example:
 *
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */
public class LongIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++){
            int max = 1;
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
        }
        int ret = 0;
        for (int i = 0; i < dp.length; i++){
            ret = Math.max(dp[i], ret);
        }
        return ret;
    }

    public int lengthOfLIS2(int[] nums) {
        int n = nums.length;
        int[] tails = new int[n];
        int len = 0;
        for (int num : nums){
            int index = binarySearch(tails, len, num);
            tails[index] = num;
            if (index == len){
                len++;
            }
        }
        return len;
    }
    public int binarySearch(int[] tails, int len, int key){
        int l = 0, h = len;
        while (l < h){
            int mid = l + (h - l) / 2;
            if (tails[mid] == key){
                return mid;
            }else if (tails[mid] > key){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
