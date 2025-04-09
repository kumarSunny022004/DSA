package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i =0; i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
//        stings are immutable data type in java but string builders are not immutable we can add things in it

    }
}
