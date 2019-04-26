import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Example 1:
 * Input:
 * "tree"
 *
 * Output:
 * "eert"
 *
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 *
 * Example 2:
 * Input:
 * "cccaaa"
 *
 * Output:
 * "cccaaa"
 */
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c : s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for(char c: frequency.keySet()){
            int times = frequency.get(c);
            if(bucket[times] == null){
                bucket[times] = new ArrayList<Character>();
            }
            bucket[times].add(c);
        }

        StringBuilder str = new StringBuilder();
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] == null){
                continue;
            }
            for(char c: bucket[i]){
                for(int j = 0; j < i; j++){
                    str.append(c);
                }
            }
        }
        return str.toString();

    }
}
