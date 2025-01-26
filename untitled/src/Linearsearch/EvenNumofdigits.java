package Linearsearch;

public class EvenNumofdigits {
    public static void main(String[] args) {
        int[] arr = {35, 45, 655, 23, 10};
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
            }
    static boolean even(int num){
        int numberofDigits = digits(num);
//        if(numberofDigits%2==0){
//            return true;
//        }
//        return false;
        return numberofDigits % 2==0;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
