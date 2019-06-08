import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Example 1:
// * Input: 2, [[1,0]]
// * Output: [0,1]
// * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished
// *              course 0. So the correct course order is [0,1] .
// *
// * Example 2:
// * Input: 4, [[1,0],[2,0],[3,1],[3,2]]
// * Output: [0,1,2,3] or [0,2,1,3]
        int[][] matrix1 = {{1, 0}};
        int[][] matrix2 = {{1, 0},{2, 0},{3, 1},{3, 2}};

        int[] s1 = new CourseScheduleII().findOrder(2, matrix1);
        System.out.println(Arrays.toString(s1));

        int[] s2 = new CourseScheduleII().findOrder(4, matrix2);
        System.out.println(Arrays.toString(s2));
    }
}
