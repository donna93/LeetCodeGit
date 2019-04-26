/**
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 *
 * Example 1:
 * Input: "aba"
 * Output: True
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 */
public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int i = -1;
        int j = s.length();
        while(++i < --j){
            if(s.charAt(i) != s.charAt(j)){
                return (isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j));
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
