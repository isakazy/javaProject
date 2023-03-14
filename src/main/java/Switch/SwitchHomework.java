package Switch;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {


        Scanner user = new Scanner (System.in);
        System.out.println("print a singe");
        String word = user.nextLine();

        switch(word){
            case "!":
                System.out.println("exclamation mark");
                break;
            case "?":
                System.out.println("question mark");
                break;
            case "%":
                System.out.println("modulus");
                break;
            case "#":
                System.out.println("hash");
                break;
            case "*":
                System.out.println("star");
                break;
            case "@":
                System.out.println("at");
                break;
            case "$":
                System.out.println("dollar singe");
                break;
        }










    }
}
