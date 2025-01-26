package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Syntax
//        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of  the Array you want to take: ");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
