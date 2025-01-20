package loopsconditions;

import java.sql.Array;
import java.util.Arrays;

public class ChangeValue {

    static void change(int[] arr){
        arr[0]=99;
    }


    public static void main(String[] args) {

        int[] arr ={65 , 78 ,99, 55};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
