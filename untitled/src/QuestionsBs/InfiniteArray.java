package QuestionsBs;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3 ,4 , 5 , 6 , 7 , 9 , 12 , 14, 16 , 19 , 25 , 56, 75};
        int target = 25;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr , int target){
        int start =0;
        int end = 1;

        while(target>arr[end]){
            int temp =end+1;
//            end = end + (size of previous box)*2
            end = end + (end - start +1)*2;
            start = temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] nums, int target,int start  , int end){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]==target)return mid;
                else if(target>nums[mid]){
                    start=mid+1;
                }
                else if(target<nums[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
    }
}
