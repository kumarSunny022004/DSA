package Sorting;

import java.util.Arrays;

// not a stable algorithm
public class Selection {
    public static void main(String[] args){
        int[] arr= {5,4,-3,2,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
//     select anm element and put it on the right plac like the smallest and largest
    static  void selection(int[] arr){
        for(int i =0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);;
        }
    }
    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr , int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr ,int start, int end){
        int max =start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
