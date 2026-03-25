package Maths;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
          if(n%c==0){
              return false;
          }
          c++;
        }
        return true;
    }
}
