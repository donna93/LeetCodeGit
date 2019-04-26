import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfAString {
    private final static HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'o', 'e', 'u', 'i'
    ,'A','O','E','I','U'));
    public static String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;

        char[] res = new char[s.length()];
        while(i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowel.contains(ci)){
                res[i++] = ci;
            }else if(!vowel.contains(cj)){
                res[j--] = cj;
            }else {
                res[i++] = cj;
                res[j--] = ci;
            }
        }
        return new String(res);
    }
}
