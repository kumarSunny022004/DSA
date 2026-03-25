package Recursion;

public class Class2 {
    public static void main(String[] args) {
        System.out.println(product(555));
       rev1(1234);
        System.out.println(sum1);
    }

//     products of  all the digits
    static int product(int n){
        if(n<=10){
            return n;
        }
        return (n%10)*product(n/10);
    }
//     recursive reversal_1
    static int sum1 =0;
static void rev1(int n){
    if(n==0){
        return;
    }
    int rem = n%10;
    sum1 = sum1*10 +rem;
    rev1(n/10);
}

// sometimes you need some external variables top help for the function so we will make another helper function
    static int rev2( int n){
    int digits =  (int)(Math.log(n))+1;
    return helper(n,digits);
    }

    private static int helper(int n, int digits) {
    if(n%10==n){
        return n;
    }
    int rem =  n%10;
    return rem*(int)(Math.pow(10, digits-1))+helper(n/10 ,digits-1);
    }


}
