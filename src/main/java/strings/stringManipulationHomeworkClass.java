package strings;

import java.util.Locale;

public class stringManipulationHomeworkClass {
    public static void main(String[] args) {
        String massage= "Hello everyone, let do java String exercises";
System.out.println(massage.length());//44
char a= massage. charAt(10);//y
System.out.println(a);

System.out.println(massage.length());//43

        System.out.println(massage.toLowerCase());
        String massage2= "HELLO EVERYONE LETS DO JAVA STRING EXERCISE";
        massage=massage2;
        System.out.println(massage);/// all in upper case(i tried using upperCase in actual code but it didn't work)
        System.out.println(massage.toLowerCase());///all in lower case
char b=massage.charAt(5);
System.out.println(b);// position 5 is gab so the output is non
        System.out.println(massage.length());
        char c = massage.charAt(42);
        System.out.println(c);//////E
       char d = massage.charAt(0);
       System.out.println(d);
       char e= massage.charAt(42);
       System.out.println(e);



















    }
}
