package rahul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    static int Fatorial(int x) {
        if (x == 0 || x == 1) return 1;
        int factorial = 1;
        for (int i = 2; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static int intvalue(int row, int col) {
        return Fatorial(row) / (Fatorial(col) * Fatorial(row - col));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int row = sc.nextInt();
        System.out.println();

        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(intvalue(i, j));
            }
            System.out.println(list.toString());
        }

        sc.close();
    }
}
