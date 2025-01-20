package rahul;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
           System.out.print("Enter the number you want to check: ");
           int a = sc.nextInt();
           int tempo = a;
           int newnum=0;
           while(a!=0){
             int temp = a%10;
             newnum= (int) (newnum+Math.pow(temp , 3));
             a= a/10;
           }
           if(newnum==tempo){
           System.out.println("This is a ArmStrong Number "+ tempo);
           }
           else{
               System.out.println("Try Again:" + newnum);
           }
       }

    }

}
