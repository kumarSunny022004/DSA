package Linearsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the the the size of the loop:");
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int el = sc.nextInt();
            list.add(el);
        }
        minimum(list);
    }
    static void minimum(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<min){
                min= list.get(i);
            }
        }
        System.out.println("The minimum for the list: "+ min);
    }
}
