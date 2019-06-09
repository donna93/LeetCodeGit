import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
// * Output: 16
//                * Explanation: The two words can be "abcw", "xtfn".
//                *
// * Example 2:
// * Input: ["a","ab","abc","d","cd","bcd","abcd"]
// * Output: 4
//                * Explanation: The two words can be "ab", "cd".
//                *
// * Example 3:
// * Input: ["a","aa","aaa","aaaa"]
// * Output: 0
        String[] input1 = {"abcw","baz","foo","bar","xtfn","abcdef"};
        String[] input2 = {"a","ab","abc","d","cd","bcd","abcd"};
        String[] input3 = {"a","aa","aaa","aaaa"};

        System.out.println(new MaxProductOfWordLen().maxProduct(input1));
        System.out.println(new MaxProductOfWordLen().maxProduct(input2));
        System.out.println(new MaxProductOfWordLen().maxProduct(input3));
    }
}
