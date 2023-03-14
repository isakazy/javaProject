package DoWhileLoop;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int number = user.nextInt();

        do{

            System.out.println("enter evan number");
            number= user.nextInt();

        }while( number % 2!=0);













    }
}
