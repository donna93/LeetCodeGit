import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class TopKFrequentEle {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int val: nums){
            frequency.put(val, frequency.getOrDefault(val, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key: frequency.keySet()){
            int times = frequency.get(key);
            if(bucket[times] == null){
                bucket[times] = new ArrayList<>();
            }
            bucket[times].add(key);
        }

        List<Integer> topK = new ArrayList<>();
        for(int i = bucket.length - 1; i >=0 && topK.size() < k; i--){
            if(bucket[i] != null){
                topK.addAll(bucket[i]);
            }

        }
        return topK;

    }
}
