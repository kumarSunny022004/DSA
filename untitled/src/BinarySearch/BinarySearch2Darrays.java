package BinarySearch;

import java.util.Arrays;

public class BinarySearch2Darrays {
    public static void main(String[] args) {
        int [][] arr={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 50}
        };
        System.out.println(Arrays.toString(search(arr, 10 )));
    }
    static int[] search(int[][] matrix , int target){
        int r= 0;
        int c= matrix.length-1;
//i have to make three checks the first one is wether the element is equl to target
//        if element<target row++
//        if elemnt>target col--;
        while(r<matrix.length && c>=0){
           if(matrix[r][c]==target){
               return new int[]{r,c};
           }
           if(matrix[r][c]<target){
               r++;
           }
           else{
               c--;
           }
        }
        return new  int[]{-1,-1};
    }
}
