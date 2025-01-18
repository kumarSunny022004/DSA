package loopsconditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("the larget is "+ max);
        System.out.println();
//        we could have also used ax funtion here
        int maxi=Math.max(a,Math.max(b,c));
        System.out.println("Now  the maximum is: "+ (maxi+1));
    }




}
