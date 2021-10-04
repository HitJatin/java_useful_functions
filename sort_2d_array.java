import java.util.*;

public class sort_2d_array {
    //Need to Review
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber] > second[columnNumber]) return 1;
               else return -1;
            }
        });
    }
}