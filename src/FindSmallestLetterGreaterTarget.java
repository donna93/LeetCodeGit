/**
 * Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target, find the smallest element in the list that is larger than the given target.
 *
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
 *
 * Examples:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 */
public class FindSmallestLetterGreaterTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int i = 0;
        int j = letters.length - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(char2Index(target) >= char2Index(letters[mid])){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }return i < len ? letters[i] : letters[0];
    }
    public static int char2Index(char c){
        return c - 'a';
    }
}
