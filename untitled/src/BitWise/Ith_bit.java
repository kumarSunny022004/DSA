package BitWise;

import java.util.Scanner;

public class Ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Now enter the bit that you want to find out");
        int n = sc.nextInt();
        System.out.println(ithBit(n,num));

    }
    private static int ithBit(int n,int num){
        return num&(1<<n-1);
    }
}
