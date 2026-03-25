package Recursion2;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumofDigits(4444));
        System.out.println(sum(1234));
        System.out.println(prod(202));
    }
//    written by me
    static int sumofDigits(int n){
        int rem = n%10;
        if(rem==0){
            return n;
        }
        return rem+sumofDigits(n/10);
    }
//    Written by him
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
//    for product
    static int prod(int n){
        if(n<=1){
            return 1;
        }
        return (n%10)*prod(n/10);
    }
}
