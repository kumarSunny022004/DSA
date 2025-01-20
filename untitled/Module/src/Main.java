import java.util.Scanner;

public class Main {
    public static void sum(int a,  int b){
        int sum = a+ b;
        System.out.println("the sum of the two numbers that you have provide is: " + sum);
    }
    static int sumate(int a, int b){
        return(a+b);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The numbers are swaped "+ a + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int first = sc.nextInt();
        System.out.println("enter the second Number");
        int sec = sc.nextInt();
        sum(first , sec);
        System.out.println("The sum of the Two numers is"+sumate(first , sec));
        swap(first ,sec);
    }
}