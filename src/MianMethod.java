import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
        String digits = "23";
        List<String> combinations = new LetterComOfPhoneNbr().letterCombinations(digits);
        for(int i = 0; i < combinations.size(); i++){
            System.out.println(combinations.get(i));
        }
    }
}
