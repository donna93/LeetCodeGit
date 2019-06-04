import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (char sChar : s.toCharArray()){
            cnt[sChar - 'a']++;
        }
        for (char tChar : t.toCharArray()){
            cnt[tChar - 'a']--;
        }
        for (int c : cnt){
            if (c != 0){
                return false;
            }
        }return true;
    }
}
