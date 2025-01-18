package loopsconditions;

import java.util.Scanner;

public class AlphabetcaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        since we cannot take char directly aas input in java so we have to use this to  take charaxter as input in java
        char c = sc.next().trim().charAt(0);
        System.out.println(c);
    }
}
