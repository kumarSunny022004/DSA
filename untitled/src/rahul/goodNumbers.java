package rahul;

import java.util.Scanner;

public class goodNumbers {
    static final int MOD = 1_000_000_007;

    static boolean isEven(long n) {
        return n % 2 == 0;
    }

    // Function to calculate (base^exp) % mod using Modular Exponentiation
    static long powerMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {  // If exp is odd
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;  // Right shift to divide exp by 2
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long ans;
            long n = sc.nextLong();
            if (isEven(n)) {
                n = n / 2;
                ans = powerMod(20, n, MOD);  // Use modular exponentiation
            } else {
                n = n - 1;
                n = n / 2;
                ans = powerMod(20, n, MOD);
                ans = (ans * 5) % MOD;  // Apply modulo
            }
            System.out.println("The answer is: " + ans);
        }
    }
}
