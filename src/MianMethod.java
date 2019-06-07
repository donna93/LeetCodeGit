import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: nums = [1,2,2,4]
// * Output: [2,3]
        int[] array = new SetMismatch().findErrorNums(new int[]{1, 2, 3, 3, 5});
        System.out.println(Arrays.toString(array));
    }
}
