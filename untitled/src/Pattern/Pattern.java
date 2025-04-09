package Pattern;

import java.util.Scanner;

public class Pattern {
    //    (Step 1) the outer for loops has to be run the number of lines in the pattern
//  (Step 2) identify for every row how amny columns are there in each  row and the type of element in teh row
//    (Step 3) what do you need to print in each column
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbersquare(n);
    }

    static void rightpyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void inverserightpyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void horizontalpyra(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int colinrow = i > n ? 2*n-i : i;
            for(int col=0; col<colinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starspade(int n){
        for (int i = 0; i < 2 * n; i++) {
//            before printing the stars we have to print the no of spaces int the pattern
            int colinrow = i > n ? 2*n-i : i;

            int spaces = n-colinrow;
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int col=0; col<colinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numpyramid(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void numspade(int n){
        for(int i=1; i<=2*n; i++){

            int c = i>n?2*n-i:i;

            for(int j=1; j<=n-c; j++){
                System.out.print(" ");
            }
            for(int j=c; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=c; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void numbersquare(int n){
        int originalN=n;
        n=2*n;
        for(int row=0; row<=n; row++){
            for(int j=0; j<n; j++){
                int evryIndex= originalN-Math.min(Math.min(row, j), Math.min(n-row, n-j));
                System.out.print(evryIndex+" ");
            }
            System.out.println();
        }
    }
}