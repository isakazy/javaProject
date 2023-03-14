package ProblemSolving;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a word ");
        String word = user.nextLine();

                boolean IsPalindrome= false;

        if(IsPalindrome){
            System.out.println("the word is palindrome");

        }else{
            System.out.println("the word is not palindrome");
        }


        for( int a = 0; a<=word.length()/2; a++ ){
            if (a != word.length()- a - 1){
               IsPalindrome = false;
            }else IsPalindrome = true;


        }





    }
}
