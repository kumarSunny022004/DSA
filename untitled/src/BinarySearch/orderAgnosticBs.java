package BinarySearch;

public class orderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {14 , 15, 16, 17, 19, 22, 23, 44, };
        int target = 22;

        int ans = orederagnosticbs(arr, target);
    }
    static int orederagnosticbs(int[] arr, int target){
        int start =0;
        int end= arr.length-1;
//        find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
           if(!isAsc){
               if(target<arr[mid]){
                   end=mid-1;
               } else  {
                   start = mid+1;
               }

           }else{
               if(target>arr[mid]){
                   end=mid-1;
               } else  {
                   start = mid+1;
               }
           }
        }
        return -1;
    }
}
