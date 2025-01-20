package rahul;

import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want to  print");
        int a= sc.nextInt();
        printPrime(a);
    }
    static void printPrime(int n){
        int num=2;
        while(n!=0){
            if(isPrime(num)){
                System.out.print(" "+num);
                n--;
            }
            num++;
        }
    }
    static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
    }
}
