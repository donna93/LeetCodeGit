import java.util.Arrays;
import java.util.Stack;

/**
 * Given a circular array (the next element of the last element is the first element of the array),
 * print the Next Greater Number for every element. The Next Greater Number of a number x is the
 * first greater number to its traversing-order next in the array, which means you could search
 * circularly to find its next greater number. If it doesn't exist, output -1 for this number.
 *
 * Example 1:
 * Input: [1,2,1]
 * Output: [2,-1,2]
 * Explanation: The first 1's next greater number is 2;
 * The number 2 can't find next greater number;
 * The second 1's next greater number needs to search circularly, which is also 2.
 * Note: The length of given array won't exceed 10000.
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> pre = new Stack<>();
        for (int curIndex = 0; curIndex < n * 2; curIndex++){
            int num = nums[curIndex % n];
            while (!pre.isEmpty() && nums[pre.peek()] < num){
                res[pre.pop()] = num;
            }
            pre.add(curIndex);
        }
        return res;
    }
}
