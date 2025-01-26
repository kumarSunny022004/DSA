package Linearsearch;

import java.util.Scanner;

public class LinearSearch {
    static void search(String str,char target){
        if(str.isEmpty()){
            return ;
        }
        for(int index=0; index<str.length(); index++){
            if(target==str.charAt(index)){
                System.out.println("the Char is present at: "+ index);
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String that you want to enetr: ");
        String str = sc.nextLine();
        System.out.println("Enter the Target: ");
        String str1 = sc.nextLine();
        char u = str1.charAt(0);
        search(str , u);
    }
}
