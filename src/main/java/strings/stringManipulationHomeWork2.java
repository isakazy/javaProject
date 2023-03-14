package strings;

import java.util.Locale;

public class stringManipulationHomeWork2 {
    public static void main(String[] args) {
       String massage = "Hello world";
       System.out.println(massage.indexOf("world"));

       System.out.println(massage.charAt(0));

       System.out.println(massage.toLowerCase().substring(0,6));
       System.out.println(massage.toUpperCase().substring(0,6));

       String exa = "hello";
       String exa2 = "HELLO";
       System.out.println(exa.equals(exa2));

       String sentence = "the quick brown fox";
       System.out.println(sentence.toUpperCase().charAt(0) + sentence.substring(1,4) + sentence.toUpperCase().charAt(4) + sentence.substring(5,10)
               + sentence.toUpperCase().charAt(10) + sentence.substring(11,16)+sentence.toUpperCase().charAt(16)+ sentence.substring(17));

      exa="Hello";

       System.out.println(""+exa.charAt(4) + exa.charAt (3) + exa.charAt (2) + exa.charAt (1) + exa.charAt (0));

       exa = "Hello World";
      char a= exa.charAt(1);
      char b = exa.charAt(4);
      char c = exa.charAt(7);
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
      int abc = 3;

      String asd = "Hello";
      String asd2 = "World";
      System.out.println(asd.concat(asd2));

      String example = "hello";
      String example2 =  "HELLO";
      System.out.println(example.equalsIgnoreCase(example2));

      String example3 = "Hello World";
      System.out.println(example3.length());


      String example4 = "Hello";
      System.out.println(example4.charAt(3));


      String example5 = "Hello world";
      System.out.println(example5.indexOf('l'));

      String example6 = "hello";
      String example7 = "hello";
      System.out.println(example6==example7);
      System.out.println(example6.equals(example7));


      String example8 = "HELLO";
      String example9 = "hello";
      System.out.println(example8==example9);
      System.out.println(example8.equals(example9));


      String example10 = "HELLO WORLD";
      System.out.println(example10.toLowerCase());

      example10="hello world";
      System.out.println(example10.toUpperCase());

      System.out.println(example10.replace('l','r'));

        String sentence1 = "the quick brown fox";
        System.out.println(sentence1.toUpperCase().charAt(0) + sentence1.substring(1,4) + sentence1.toUpperCase().charAt(4) + sentence1.substring(5,10)
                + sentence1.toUpperCase().charAt(10) + sentence1.substring(11,16)+sentence1.toUpperCase().charAt(16)+ sentence1.substring(17));






































    }





}
