package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(  fibo(7));

        for (int i=0; i<=7; i++){
            System.out.println(fibo2(i));
        }
    }
     static  int fibo2(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2)- ((1-Math.sqrt(5))/2),n)/Math.sqrt(5));
     }

    static int fibo(int n){
//        base conditon
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
