import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {14 , 15, 16, 23, 44};
        Arrays.sort(arr); // Binary search requires sorted array
        int target = 23;
        int position = binarySearch1(arr, target, 0, arr.length - 1);
        System.out.println("The position of the target is: " + position);
        int position2=binarysearch2(arr, 44);
        System.out.println("The position of the target is: " + position2);

    }


//    this is written by me
    static int binarySearch1(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Base case: Target not found
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid; // Target found
        } else if (target > arr[mid]) {
            return binarySearch1(arr, target, mid + 1, end); // Search right half
        } else {
            return binarySearch1(arr, target, start, mid - 1); // Search left half
        }
    }
    //by kunal
//    return the index and return -1 if the target is not found in the array
    static int binarysearch2(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
//            find the middle element
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
