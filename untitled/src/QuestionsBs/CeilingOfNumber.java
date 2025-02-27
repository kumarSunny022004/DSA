package QuestionsBs;
//arr={2,3,5,9,14,16,18} target is 15 what we have to do is we have to find an element which greater than or equal to target
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = search(arr, 15);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
//        if the target even greater than all the elements of the array then what we can do is
        if(target>arr[arr.length-1]){return -1;}
        int n= arr.length;
        int start=0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target)return mid;
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }
        return start;
    }
}
