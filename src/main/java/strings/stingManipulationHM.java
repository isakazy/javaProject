package strings;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class stingManipulationHM {
    public static void main(String[] args) {


        String str = "Hello Universe";
        char ch ='o';
        System.out.println(str.contains("o"));

        String str2 = "Hello World!";
        System.out.println(str2.substring(7,12));

        String str3 ="Good Morning World";
        System.out.println(str3.indexOf('W'));
        System.out.println(str3.charAt(13));


        String str4 = "           i love coding       ";
            System.out.println(str4.strip());


            String str5 = "Learn as you will live forever, live as you will die tomorrow ";
            System.out.println(str5.replace('o',' '));



    }
}
