import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: s = "leetcode", wordDict = ["leet", "code"]
// * Output: true
//                * Explanation: Return true because "leetcode" can be segmented as "leet code".
//                *
// * Example 2:
// * Input: s = "applepenapple", wordDict = ["apple", "pen"]
// * Output: true
//                * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//                *              Note that you are allowed to reuse a dictionary word.
//                *
// * Example 3:
// * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
// * Output: false
        String s1 = "leetcode";
        List<String> word1 = new ArrayList<>();
        word1.add("leet");
        word1.add("code");
        System.out.println(new WordBreak().wordBreak(s1, word1));
    }
}
