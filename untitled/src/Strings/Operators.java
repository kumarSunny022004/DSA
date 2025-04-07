package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
//        when a integer is added to the string it is converted into a string by calling the toString() function
//        thisis same as "a"+"1"

        System.out.println("Sunny"+new ArrayList<>());
        System.out.println("Sunny"+ new Integer(56));
//        System.out.println(new ArrayList<>()+ new Integer(56));// this will give an error since it is not alllowed the plus + sign is only allwoed with primitive data types and
//        if the things we are adding one of them had to be String and operator m,inus -cannot work for strings
        System.out.println(new ArrayList<>()+ ""+ new Integer(56));
    }
}
