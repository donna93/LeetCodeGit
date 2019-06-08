import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//* Example 1:
// * Input: [[1,3], [0,2], [1,3], [0,2]]
// * Output: true
//                * Explanation:
// * The graph looks like this:
// * 0----1
// * |    |
// * |    |
// * 3----2
// * We can divide the vertices into two groups: {0, 2} and {1, 3}.
// *
// * Example 2:
// * Input: [[1,2,3], [0,2], [0,1,3], [0,2]]
// * Output: false
//                * Explanation:
// * The graph looks like this:
// * 0----1
// * | \  |
// * |  \ |
// * 3----2
// * We cannot find a way to divide the set of nodes into two independent subsets.
        int[][] graph1 = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        int[][] graph2 = {
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2},
        };
        System.out.println(new IsGraphBipartite().isBipartite(graph1));
        System.out.println(new IsGraphBipartite().isBipartite(graph2));
    }
}
