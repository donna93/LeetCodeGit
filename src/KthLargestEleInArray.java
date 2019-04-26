import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 *
 * Example 2:
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 */
public class KthLargestEleInArray {
    //Array.sort()
    public static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    //priorityQueue
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);

            if(pq.size() > k){
                pq.poll();
            }
        }return pq.peek();
    }

    //快排
    public static int findKthLargest3(int[] nums, int k) {
        k = nums.length - k;
        int l = 0;
        int h = nums.length - 1;
        while(l < h){
            int j = partition(nums, l, h);
            if(j == k){
                break;
            }else if(j < k){
                l = j + 1;
            }else{
                h = j - 1;
            }
        }
        return nums[k];
    }
    public static int partition(int[] nums, int l, int h){
        int i = l;
        int j = h + 1;
        while(true){
            while(nums[++i] < nums[l] && i < h);
            while(nums[--j] > nums[l] && j > l);
            if(i >= j){
                break;

            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
