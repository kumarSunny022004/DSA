package BitWise;

public class PowofTwo {
    public static void main(String[] args) {
        int n = 31;
        boolean b =  (n&(n-1))==0;
        System.out.println(b);
    }
}
