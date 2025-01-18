package rahul;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        float a = input.nextFloat();
//        System.out.println(a);// this is allowed in java

//    casting incompatible types is known as typecasting
        int num = (int)(65.76F);
        System.out.println(num);
    }
}
