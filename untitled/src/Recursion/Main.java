package Recursion;

public class Main {
//    it helps us in solving complex questions in simple way
//  recursive method can be converted into iterative method and vice versa
//    it has some space complexity to
//    bigger peoblems can be converted into smaller one withthte help of smaller problems
    public static void main(String[] args) {

//        numPrint(5);
        System.out.println(sumation(1345));
    }
    static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
//     other way to this question is
    static void numPrint(int n){
        if(n==0){
            return ;
        }
        numPrint(n-1);
        System.out.println(n);
    }
//     factorial
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
//    sumations till n
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
//    summation of digits
    static int sumation(int n){
        int rem = n%10;
        if(n<=10){
            return n;
        }
        return rem + sumation(n/10);
    }
}
