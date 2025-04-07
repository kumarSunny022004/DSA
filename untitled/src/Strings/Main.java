package Strings;

public class Main {

    public static void main(String[] args) {
        String a = "sunny";
        String b= "sunny";


        String c = new String("Sunny");
        String d = new String("Sunny");

        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
