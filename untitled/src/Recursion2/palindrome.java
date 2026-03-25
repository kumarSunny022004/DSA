package Recursion2;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(plain(122));
    }
    static int reverse(int n){
        if(n/10==n){
            return n;
        }
        return (int)(n%10*Math.pow(10,(int)(Math.log10(n))))+reverse(n/10);
    }
    static boolean plain(int n){
        return n == reverse(n);
    }
}
