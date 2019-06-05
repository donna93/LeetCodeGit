/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Note:
 * The input string length won't exceed 1000.
 */
public class PalindromicSubstrings {
    int cnt = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++){
            extendString(s, i, i);
            extendString(s, i, i + 1);
        }
        return cnt;
    }
    public void extendString(String s, int start, int end){
        while (start >= 0 && end < s.length() && start < end && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            cnt++;
        }
    }
}
