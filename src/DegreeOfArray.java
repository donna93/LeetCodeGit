import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length
 * of a (contiguous) subarray of nums, that has the same degree as nums.
 *
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 *
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 */
public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> numCnt = new HashMap<>();
        Map<Integer, Integer> firstIdx = new HashMap<>();
        Map<Integer, Integer> lastIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            numCnt.put(nums[i], numCnt.getOrDefault(nums[i], 0) + 1);
            lastIdx.put(nums[i], i);
            if (!firstIdx.containsKey(nums[i])){
                firstIdx.put(nums[i], i);
            }
        }
        int maxCnt = 0;
        for (int n : nums){
            maxCnt = Math.max(maxCnt, numCnt.get(n));
        }
        int minLen = nums.length;
        for (int i = 0; i < nums.length; i++){
            int cnt = numCnt.get(nums[i]);
            if (cnt != maxCnt) continue;
            minLen = Math.min(minLen, lastIdx.get(nums[i]) - firstIdx.get(nums[i]) + 1);
        }
        return minLen;
    }
}
