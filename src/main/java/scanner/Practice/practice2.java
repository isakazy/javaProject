package scanner.Practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter number");
        int number2 = user.nextInt();
        int number = user.nextInt();
        if (number2 % number == 0) {
            System.out.println("the number is devisable");
        }else {
            System.out.println("the number is not devisable");
        }
    }
}