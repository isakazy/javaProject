package BreakMyPractice;

import java.util.Locale;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a word");
        String word = user.nextLine() ;
        System.out.println("enter a second word");
        String word2 = user.nextLine();

        word = word.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word+ word2.toUpperCase().charAt(0) +word2.substring(1));

        System.out.println(word.toUpperCase()+ word2 + word2 + word.toUpperCase());


        System.out.println(word + word2.replace('a','.')+ word2.toUpperCase());

        System.out.println(word.substring(0,2 )+ word2.substring(0,2));
        System.out.println(word.substring(3)+word2.substring(4));
        System.out.println(word.toUpperCase().substring(0,1 )+ word2.toUpperCase().substring(0,1));


        System.out.println("enter a word");








    }
}
