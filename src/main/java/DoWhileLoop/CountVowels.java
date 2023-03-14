package DoWhileLoop;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int counter = 0;
        do {
            System.out.println("enter a String with 10 vowels");
            String string = user.next();

            for (int i = 0; i < string.length(); i++) {
                string = string.toLowerCase();
                if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || string.charAt(i) == 'y' || string.charAt(i) == 'u' || string.charAt(i) == 'i') {
                    counter++;
                }
                }

            System.out.println("the entered word vowel count:" + counter);


        }while( counter !=10);









    }
}