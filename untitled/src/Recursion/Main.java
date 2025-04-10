package Recursion;

public class Main {
//    it helps us in solving complex questions in simple way
//  recursive method can be converted into iterative method and vice versa
//    it has some space complexity to
//    bigger peoblems can be converted into smaller one withthte help of smaller problems
    public static void main(String[] args) {

        print(1);
    }
    static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
