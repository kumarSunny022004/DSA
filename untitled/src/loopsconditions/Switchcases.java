package loopsconditions;
import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day that you like: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter a valid number");
        }
        switch (n){
            case 1 -> System.out.println("number 1");
            case 2 -> System.out.println("number 2");
            case 3 -> System.out.println("number 3");
            case 4 -> System.out.println("number 4");
        }
        switch (n){
            case 1,2,3,4,5 -> System.out.println("Oh shit you have selected a weekday");
            case 6,7 -> System.out.println("good you have selected Weekend");
        }
    }
}
