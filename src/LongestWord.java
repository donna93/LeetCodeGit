import java.util.List;

/**
 * Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
 *
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *
 * Output:
 * "apple"
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 *
 * Output:
 * "a"
 */
public class LongestWord {
    public static String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for(String target : d){
            if(longestWord.length() > target.length() ||
                    (longestWord.length() == target.length() && longestWord.compareTo(target) < 0)){
                continue;
            }
            if(isValid(s, target)){
                longestWord = target;
            }
        }
        return longestWord;

    }

    public static boolean isValid(String s, String target){
        int i = 0;
        int j = 0;
        while(i < s.length() && j < target.length()){
            if(s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}
