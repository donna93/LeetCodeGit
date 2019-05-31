import java.util.Arrays;

/**
 * Given an array nums of n integers where n > 1,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        Arrays.fill(product, 1);
        int left = 1;
        for (int i = 1; i < n; i++){
            left *= nums[i - 1];
            product[i] *= left;
        }
        int right = 1;
        for (int j = n - 2; j >= 0; j--){
            right *= nums[j + 1];
            product[j] *= right;
        }
        return product;
    }
}
