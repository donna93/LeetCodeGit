/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int zero = -1;
        int one = 0;
        int two = nums.length;
        while(one < two){
            if(nums[one] == 0){
                swap(nums, ++zero, one++);
            }else if(nums[one] == 2){
                swap(nums, --two, one);
            }else{
                ++one;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
