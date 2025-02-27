package QuestionsBs;

public class FloorofNumber {
    public static void main(String[] args) {
//         same as just we are going to return the end since the end is going to become end=start-1;
        int[] arr = {2,3,5,9,14,16,18};
        int ans = search(arr, 15);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){

//        if the target even smaller than all the elements of the array then what we can do is
        if(target<arr[0]){return -1;}
        int n= arr.length;
        int start=0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }
        return end;
    }
}
