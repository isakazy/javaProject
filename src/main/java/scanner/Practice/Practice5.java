package scanner.Practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("enter any word");
        String word = user.nextLine();
        System.out.println(word.toLowerCase());
    }
}
