import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example:
// * Input: "aab"
//                * Output:
// * [
// *   ["aa","b"],
// *   ["a","a","b"]
// * ]
        List<List<String>> combinationList = new PalindromePartitioning().partition("aab");
        System.out.println(combinationList.toString());
    }
}
