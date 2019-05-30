import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
// * Example 1:
// * Input:
// * 26
// * Output:
// * "1a"
//                *
// * Example 2:
// * Input:
// * -1
// * Output:
// * "ffffffff"

        System.out.println(new ConvertNbrToHexadecimal().toHex(26));
        System.out.println(new Base7().convertToBase7(-1));
    }
}
