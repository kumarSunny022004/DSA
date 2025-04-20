package BitWise;

public class Factors {
    public static void main(String[] args) {
      factors(40);
    }
//     simple method
    static void factors(int n){
        for( int i=1; i*i<=n; i++){
            if(n%i==0){
                if(n/i!=i){
                    System.out.println(i + " "+ n/i);
                }else{
                    System.out.println(i);
                }
            }
        }
    }
}
