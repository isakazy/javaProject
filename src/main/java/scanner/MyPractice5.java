package scanner;

import java.util.Scanner;

public class MyPractice5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int number = 5;
        System.out.println("enter number from 0 to 10:");
         number = user.nextInt();
         if(number>=0 && number<=10){
             System.out.println("valid input");
         }else {
             System.out.println("invalid input");


         }

    }
}
