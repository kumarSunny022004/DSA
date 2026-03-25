package Recursion2;

public class Concept {
    public static void main(String[] args) {

    }
//    this will give an infinte loop
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        concept(n--);
//        --n vs n--
//         what is the difference
    }


}
