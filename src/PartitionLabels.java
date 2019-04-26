import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
 *
 * Example 1:
 * Input: S = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 */
public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        int[] lastIndexOfChar = new int[26];
        for(int i = 0; i < S.length(); i++){
            lastIndexOfChar[char2Index(S.charAt(i))] = i;
        }
        List<Integer> partition = new ArrayList();
        int firstIndex = 0;
        while(firstIndex < S.length()){
            int lastIndex = firstIndex;
            for(int i = firstIndex; i <= lastIndex && i < S.length(); i++){
                int index = lastIndexOfChar[char2Index(S.charAt(i))];
                if(index > lastIndex){
                    lastIndex = index;
                }
            }
            partition.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
            System.out.println(partition);
        }
        return partition;
    }

    public static int char2Index(char c){
        return c - 'a';
    }
}
