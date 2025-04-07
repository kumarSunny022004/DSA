package Strings;

public class PrettyPriinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("formated it till two  decimal value %.2f", a);
        System.out.println();

        System.out.printf("The value of the pie is %.13f", Math.PI);

        System.out.println();

        String A = new String("Sunny");
        String B = new String("Yaduvanshi");

        System.out.printf("Hello my name is %s and the surname is %s",A,B);;


//        %s  → String (uses toString())
//                %c  → Character
//                %d  → Decimal integer
//                %o  → Octal integer
//                %x  → Hexadecimal integer (lowercase)
//                %X  → Hexadecimal integer (uppercase)
//                %f  → Decimal floating-point (float/double)
//                %e  → Scientific notation (lowercase)
//                %E  → Scientific notation (uppercase)
//                %g  → General format for float (uses %f or %e)
//                 %a  → Hexadecimal floating-point (lowercase)
//                %A  → Hexadecimal floating-point (uppercase)
//                %b  → Boolean (true/false)
//                %tY → Year (4 digits)
//                %ty → Year (last 2 digits)
//                %tm → Month (01–12)
//                %td → Day of month (zero-padded)
//                %te → Day of month (non-padded)
//                %tB → Full month name
//                %tb → Abbreviated month name
//                %tA → Full weekday name
//                %ta → Abbreviated weekday name
//                %tH → Hour (00–23)
//                %tI → Hour (01–12)
//                %tM → Minute (00–59)
//                %tS → Second (00–60)
//                %tL → Milliseconds (000–999)
//                %tN → Nanoseconds (000000000–999999999)
//                %tp → AM/PM (lowercase)


    }
}
