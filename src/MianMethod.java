import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input: [1,3,4,2,2]
// * Output: 2
//                *
// * Example 2:
// * Input: [3,1,3,4,2]
// * Output: 3
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        System.out.println(new FindDuplicateNbr().findDuplicate2(nums1));
        System.out.println(new FindDuplicateNbr().findDuplicate2(nums2));
    }
}
