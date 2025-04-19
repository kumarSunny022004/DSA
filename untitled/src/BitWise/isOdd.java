package BitWise;

public class isOdd {
    public static void main(String[] args) {
        System.out.println(setBits(9));
    }

    private static boolean isODD(int n){
        return (n & 1) == 1;
    }
     static int Double(int[] arr){
        int ans = 0;
        for (int i=0; i<arr.length; i++){
             ans ^= arr[i];
        }

       return ans;
    }

    static int mask(int n ){
        int mask = 1<<n-1;
        int ans = n&mask;
        return ans;
    }
// what is the magic nth number
    static int magicNum(int n){
        int ans =0;
        int base = 5;
        while(n>0){
            int last = n&1;
            ans+=last*base;
            n = n>>1;
            base = base*5;
        }
        return ans;
    }
//    no of digits
    static int noofDitgits(int number, int base){
        int ans = (int)(Math.log(number)/Math.log(base))+1;
        return ans;
    }
//    power
    static int power(int base, int power){
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        return ans;
    }
//    find the number of set bits
    static int setBits(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){
                count+=1;
            }
            num=num>>1;
        }
        return count;
    }

//    power method 2
    static int power2(int num){
        int count=0;
        while(num>0){
            count++;
            num=num&num-1;
        }
    return count;
    }
}
