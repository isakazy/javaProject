package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

      int randomNumber = new Random().nextInt(1, 100);

      Scanner user = new Scanner(System.in);

        do {
            System.out.println("enter a number from 1 to 100");
            int number = user.nextInt();
            if (number < randomNumber) {
                System.out.println("the number is too low"+ randomNumber);
            } else if (number > randomNumber) {
                System.out.println("the number is too high " + randomNumber);
            } else if (number == randomNumber) {
                System.out.println("you guessed the number"+ randomNumber);
            } else {
                System.out.println("enter a number from 1 to 100");
                break;
            }

        }while(1<=100);





        }
    }