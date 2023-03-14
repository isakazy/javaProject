package DoWhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class CountDigitsHomWork {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int counter = 0;
        do {
            System.out.println("enter a word");
           String  word = user.nextLine();
            word = word.toLowerCase();

            for (int a = 0; a < word.length(); a++) {

                if (word.charAt(a) == '1' || word.charAt(a) == '2' || word.charAt(a) == '3' || word.charAt(a) == '4' || word.charAt(a) == '5'
                        || word.charAt(a) == '6' || word.charAt(a) == '7' || word.charAt(a) == '8' || word.charAt(a) == '9' || word.charAt(a) == '0') {
                    counter++;
                }
            }
            System.out.println("the entered word contains :" + counter);


        } while(counter !=3);





    }
}
