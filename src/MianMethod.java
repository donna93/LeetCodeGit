import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
//        Input:
// * [4,3,2,7,8,2,3,1]
// *
// * Output:
// * [5,6]
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = new FindAllNbrsDisappearedInArr().findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(list.toString());
    }
}
