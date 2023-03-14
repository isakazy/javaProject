package strings;

import java.util.Scanner;

public class ReverseStringHomework {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a statement");
String word= user.nextLine();
String reverse = "";
        for(int a = word.length()-1;  a>=0; a--){
            reverse+=word.charAt(a);
        }
        System.out.println(  reverse);

    }
}
