import java.util.Scanner;

public class Main {
    public static void sum(int a,  int b){
        int sum = a+ b;
        System.out.println("the sum of the two numbers that you have provide is: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int first = sc.nextInt();
        System.out.println("enter the second Number");
        int sec = sc.nextInt();
        sum(first , sec);
    }
}