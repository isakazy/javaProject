package DoWhileLoop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int number;

        do {
            System.out.println("enter a negative number");
            number = user.nextInt();

        } while (number <= 0) ;





    }
}
