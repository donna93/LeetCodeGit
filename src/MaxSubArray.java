/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int preSum = nums[0];
        int maxSum = preSum;
        for(int i = 1; i < nums.length; i++){
            if(preSum > 0){
                preSum = preSum + nums[i];
            }else{
                preSum = nums[i];
            }maxSum = Math.max(preSum, maxSum);
        }return maxSum;
    }
}
