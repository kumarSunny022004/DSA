package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,55,33,44,27};
        int target = 33;
        System.out.println(search(arr, target, 0, 7));

    }
   static int search(int[]arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s +(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr , target , s, mid-1);
        }
        return search(arr, target, mid+1, e);
   }
}
