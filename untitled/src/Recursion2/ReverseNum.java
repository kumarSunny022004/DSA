package Recursion2;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse3(1234  ));
        sum = 0;
        reverse2(1234);
        System.out.println(sum);
//    written by me
    }
    static int reverse(int n){
        if(n/10==n){
            return n;
        }
        return (int)(n%10*Math.pow(10,(int)(Math.log10(n))))+reverse(n/10);
    }

//    by him
    static int sum =0;
    static void reverse2(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse2(n/10);
    }
//    by him
    static int reverse3(int n){
//        sometimes we Actually need some additional variables n=in teh argument so for that we can make helper functions
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem *(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

}
