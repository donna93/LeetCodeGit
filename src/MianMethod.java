import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//   Example 1:
// * Input: 2, [[1,0]]
// * Output: true
// * Explanation: There are a total of 2 courses to take.
// *              To take course 1 you should have finished course 0. So it is possible.
// *
// * Example 2:
// * Input: 2, [[1,0],[0,1]]
// * Output: false
        int[][] matrix1 = {{1, 0}};
        int[][] matrix2 = {{1, 0},{0, 1}};
        System.out.println(new CourseSchedule().canFinish(2, matrix1));
        System.out.println(new CourseSchedule().canFinish(2, matrix2));
    }
}
