package ProblemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        String word = "car";
        if (word.isEmpty()){
            System.out.println("the string is empty");
        }else {
            System.out.println("the string is not empty");
        }


String word2 = "hi";
int counter= 0 ;
        for(int a = 0; a<= word2.length(); a++) {
            int b;
            for (b = 0; b <= word2.length(); b++) {
                if(word2.charAt(a)== word2.charAt(b)) {
                    counter++;
                }

            }  System.out.println( word.charAt(a) +"  :  "+counter);

        }




















}







    }

