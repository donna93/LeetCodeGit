import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
        int[] array1 = {4, 3, 3, 6,6,6, 7};
        int j = new MinimumMovestoEqualArrayEleII().partition(array1, 0, 3);
        System.out.println(Arrays.toString(array1) + " j: " + j);
    }
}
