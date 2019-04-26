import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once.
 * Find this single element that appears only once.
 *
 * Example 1:
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * Example 2:
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 */
public class SingleEleInASortedArray {
    //HashMap -- too slow...
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int k = 0;
        for(int key : frequency.keySet()){
            int times = frequency.get(key);
            if(times == 1){
               k = key;
            }
        }
        return k;
    }

    //Binary Search
    public static int singleNonDuplicate2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int l = 0;
        int h  = nums.length - 1;
        while(l < h){
            int mid = l + (h - l) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid + 1])
                l = mid + 2;
            else
                h = mid;
        }return nums[h];
    }
}
