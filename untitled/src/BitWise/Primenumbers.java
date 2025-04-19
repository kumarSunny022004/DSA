package BitWise;

public class Primenumbers {
    public static void main(String[] args) {
        int n = 20;
        for(int i=1; i<=20; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        boolean[] primes=  new boolean[n+1];
        sieve(n, primes);
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

//    optimized way to solve this question to find the number of primes know as sieve of eratosthenes
    static void sieve(int n , boolean[] primes){
        for(int i= 2; i*i<=n; i++){
            if(!primes[i]){
                for(int j = 2*i; j<=n; j+=i){
                    primes[j]=true;
                }
            }
        }

        for(int i =2; i<=n; i++){
           if(!primes[i]){
               System.out.print(i+" ");
           }
        }
    }

}
