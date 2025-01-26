package Linearsearch;
import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 99 ,5},
                {6, 9, 8},
                {36 , 45 ,64},
                {89 , 75 , 32, 1, 2 ,3}
        };
        int target = 156;
        int[] ans= search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i= 0; i<arr.length; i++){
            for( int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{ i, j};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
