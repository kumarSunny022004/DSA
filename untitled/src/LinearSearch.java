import java.util.Scanner;

public class LinearSearch {
    static void Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The given target exists at position: " + i);
                return;
            }
        }
        System.out.println("Target not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Search(arr, 5);
    }
}
