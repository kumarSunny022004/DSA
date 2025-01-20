package rahul;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        kuchbi(2, 3, 4, 5, 6, 7, 8);
    }
     static void kuchbi(int ...v){
         System.out.println(Arrays.toString(v));
     }
}
