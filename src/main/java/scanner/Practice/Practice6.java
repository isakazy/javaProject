package scanner.Practice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter boolean");
        boolean a = user.nextBoolean();
        System.out.println("enter second boolean");
        boolean b =user.nextBoolean();
        System.out.println("enter third boolean");
        boolean c = user.nextBoolean();

        if ( a == true && b == true && c == true ){

        System.out.println("at least two of them are true ");

        }else {System.out.println("one of them is not true");}
    }
}
