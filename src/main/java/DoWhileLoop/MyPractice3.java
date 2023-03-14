package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class MyPractice3 {
    public static void main(String[] args) {





        int RandomNumber = new Random().nextInt(1,100);
            Scanner user = new Scanner(System.in);
            int number;
        do{
            System.out.println( "enter a number from 1 to 100");
            number = user.nextInt();
            if (number < RandomNumber){
                System.out.println(RandomNumber+" "+"the number is too low");
            }else if(number > RandomNumber){
                System.out.println(RandomNumber+" "+"the number is too high");
            }else if( number == RandomNumber ){
                System.out.println(RandomNumber+" "+"the numbers MATCHED, YOU WON");
            }
        }while(RandomNumber== number);













    }
}
