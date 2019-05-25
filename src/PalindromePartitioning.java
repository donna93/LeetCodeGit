import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.
 *
 * Example:
 * Input: "aab"
 * Output:
 * [
 *   ["aa","b"],
 *   ["a","a","b"]
 * ]
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<String> partitions = new ArrayList<>();
        List<List<String>> partitionList = new ArrayList<>();
        backtracking(s, partitions, partitionList);
        return partitionList;
    }
    public void backtracking(String s, List<String> partitions, List<List<String>> partitionList){
        if (s.length() == 0){
            partitionList.add(new ArrayList<>(partitions));
            return;
        }
        for (int i = 0; i < s.length(); i++){
            if (isPalindrome(s, 0, i)){
                partitions.add(s.substring(0, i + 1));
                backtracking(s.substring(i + 1), partitions, partitionList);
                partitions.remove(partitions.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }return true;
    }
}
