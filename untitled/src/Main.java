import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        float a = sc.nextFloat();
        System.out.println("enter the first number ");
        float b= sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of the two numbers is :"+sum);
        sc.nextLine();
        System.out.println("What is your name");
        String c = sc.nextLine();
        System.out.println("you are most welcome mr "+ c);

    }
}