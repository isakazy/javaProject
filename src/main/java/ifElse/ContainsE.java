package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static  void main(String[] args) {




       Scanner user =new Scanner(System.in);

        System.out.println("enter a word");
        String word = user.nextLine();

        if(word.contains("e")){
            System.out.println(word.indexOf("e"));
        }else {
            System.out.println("the word does not contain e");
        }


    }
}
