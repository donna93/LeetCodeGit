import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: word1 = "horse", word2 = "ros"
//                * Output: 3
//                * Explanation:
// * horse -> rorse (replace 'h' with 'r')
// * rorse -> rose (remove 'r')
// * rose -> ros (remove 'e')
// *
// * Example 2:
// * Input: word1 = "intention", word2 = "execution"
// * Output: 5
        System.out.println(new EditDistance().minDistance("horse", "ros"));
        System.out.println(new EditDistance().minDistance("intention", "execution"));
    }
}
