package scanner.Practice;

import java.util.Scanner;

public class practicwe12 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);


        System.out.println("enter a word");
        String word = user.nextLine();

        System.out.println("enter 2 word");
        String word2 = user.nextLine();

        if (word.length()> word2.length()){
            System.out.println(word.length());
        }else if (word.length()<word2.length()){
            System.out.println(word2.length());}



    }
}
