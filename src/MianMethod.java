import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word1 = "ABCCED"; //, return true.
        String word2 = "SEE"; //return true.
        String word3 = "ABCB"; // return false.

        System.out.println(new WordSearch().exist(board, word1));
        System.out.println(new WordSearch().exist(board, word2));
        System.out.println(new WordSearch().exist(board, word3));
    }
}
