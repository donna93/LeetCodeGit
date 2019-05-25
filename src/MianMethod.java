import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: m = 3, n = 2
// * Output: 3
// * Explanation:
// * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// * 1. Right -> Right -> Down
//                * 2. Right -> Down -> Right
//                * 3. Down -> Right -> Right
//                *
// * Example 2:
// * Input: m = 7, n = 3
// * Output: 28
        System.out.println(new UniquePath().uniquePaths(3, 2));
        System.out.println(new UniquePath().uniquePaths(7, 3));
    }
}
