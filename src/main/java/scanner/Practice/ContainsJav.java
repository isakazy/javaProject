package scanner.Practice;

import java.util.Scanner;

public class ContainsJav {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);

        System.out.println("enter any word");
        String word = user.next();

        if(word.contains("java")){
            System.out.println("the word contains java");
        }else{
            System.out.println("the word doesnt contain java");
        }
    }


    


}
