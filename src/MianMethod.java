import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
        int [][] matrix = {{1, 2, 2, 3, 5},
                           {3, 2, 3, 4, 4},
                           {2, 4, 5, 3, 1},
                           {6, 7, 1, 4, 5},
                           {5, 1, 1, 2, 4}};

        PacificAltlanticWaterFlow p = new PacificAltlanticWaterFlow();
        List<int[]> points = p.pacificAtlantic(matrix);
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i)[0]+ " " + points.get(i)[1]);
        }
    }
}
