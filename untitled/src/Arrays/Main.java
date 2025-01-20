package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        we are going to study about the arrays today
//        Syntax is like dataType[] arrayName = new dataType[size]
//        or dataType[] arrayName = {array values}
        System.out.println("Now we are going to take inputs form the array: ");
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();;
        System.out.println("Enter the Names");
        String[] students= new String[n];
        for(int i=0; i<n; i++){
            students[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(students));
        }
}
