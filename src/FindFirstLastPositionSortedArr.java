/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class FindFirstLastPositionSortedArr {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums == null)
            return new int[]{-1, -1};
        int first = BinarySearch(nums, target);
        int last = BinarySearch(nums, target + 1) - 1;
        if(first == nums.length - 1 || nums[first] != target)
            return new int[]{-1, -1};
        else
            return new int[]{first, Math.max(first, last)};

    }
    public static int BinarySearch(int[] nums, int target){
        if(nums.length == 0 || nums == null)
            return 0;
        int l = 0;
        int h = nums.length;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] >= target)
                h = mid;
            else
                l = mid + 1;
        }return l;
    }
}
