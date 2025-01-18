package loopsconditions;

import java.util.Scanner;

public class Occurenceques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number that you want to take");
        int a = sc.nextInt();
        System.out.println("What is your target you want to count");
        int t= sc.nextInt();
        int cnt=0;
        int newnum=0;
        while(a!=0){
            int temp=a%10;
            newnum=newnum*10+temp;//this is for the revarsal of the number
            if(temp==t){
                cnt++;
            }
            a=a/10;
        }
        System.out.println("The Number of times it is repeated is: " +cnt);
        System.out.println("The reversed number is: " + newnum);

//        Now if you want to reverse the number here is the program  that can be written

    }
}
