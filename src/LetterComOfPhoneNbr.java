import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing digits from 2-9 inclusive, return all
 * possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons)
 * is given below. Note that 1 does not map to any letters.
 */
public class LetterComOfPhoneNbr {
    private String[] KEY = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0 || digits == null){
            return combinations;
        }
        doCombination(new StringBuilder(), combinations, digits);
        return combinations;
    }
    public void doCombination(StringBuilder prefix, List<String> combinations, final String digits){
        if(prefix.length() == digits.length()){
            combinations.add(prefix.toString());
            return;
        }
        int curDigit = digits.charAt(prefix.length()) - '0';
        String letter = KEY[curDigit];
        for(char c : letter.toCharArray()){
            prefix.append(c);
            doCombination(prefix, combinations, digits);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}
