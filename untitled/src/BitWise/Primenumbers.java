package BitWise;

public class Primenumbers {
    public static void main(String[] args) {
        int n = 20;
        for(int i=1; i<=20; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

//    optimized way to solve this question to find the number of primes

}
