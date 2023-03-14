package ProblemSolving;

import java.util.Scanner;

public class myWork {
    public static void main(String[] args) {

        Scanner user = new Scanner ( System.in);
        System.out.println("enter a word");
        String str = user.nextLine();
        String reversed = "";
        for(int i = str.length()-1;  i>=0; i--  ){
          reversed= reversed + str.charAt(i);
        }
        System.out.println(reversed);





    }
}
