package loopsconditions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to print: ");
        int n=sc.nextInt();
        int f= 0;
        int s= 1;
        //for loop 
        for(int i=0; i<n; i++){
            if(i>1){
                int next = s +f;
                System.out.print(next+" ");
                f= s;
                s= next;
            }
            else{
                System.out.print(i+" ");
            }
        }

    }
}
