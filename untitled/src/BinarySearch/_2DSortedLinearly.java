package BinarySearch;

import java.util.Arrays;

//take middle col and perform bs on it (to reduce the no of rows)
//if element ==target return ans
//if element>target ignore all the rows after it
//if element <target ignore all the rows abhove it
//we'll take two bounds row=0(lower bound),row=last(upper bound) and
//in the end two rows are remaining
//we will search for the current col we wll divide the remaining matrix in four parts it'll take log(n)+log(m)
public class _2DSortedLinearly {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }
//    search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int colstart, int colend, int target){
        while(colstart<=colend){
            int mid = colstart +(colend-colstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                colend=mid-1;
            }else{
                colstart=mid-1;
            }
        }
        return new int[]{-1, -1};
    }
    static  int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int col = matrix[0].length;//be cautious over here matrix can be empty
// this is when the matrix has only one row
        if(rows==1){
            return binarySearch(matrix, 0,0, col-1, target);
        }

//        now we will loop in the matrix till only two rows are remaining
        int rStart= 0;
        int rEnd = rows-1;
        int cMid = col/2;
        while(rStart<(rEnd-1)){
            int mid = rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart =mid;
            }else{
                rEnd=mid;
            }
        }

//        Now w ehave two rows
//        we will check wether target is in the col of two rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart, cMid};
        }
//        search in 1st half
        if(target<=matrix[rStart][cMid+1]){
           return binarySearch(matrix , rStart, 0, cMid-1, target);

        }
//        search in 2nd half
        if(target<matrix[rStart][cMid-1] && target<=matrix[rStart][col-1]){
            return binarySearch(matrix , rStart, cMid+1, col -1, target);
        }
//        search in 3rd half
        if(target<matrix[rStart][cMid-1]){
            return binarySearch(matrix , rStart+1 , 0, cMid-1, target);
        }
//        search in 4th half
        else{
            return binarySearch(matrix , rStart+1, cMid+1, col -1, target);
        }

    }
}
