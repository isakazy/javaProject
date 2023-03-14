package BreakMyPractice;

import java.util.Scanner;

public class MyPracticeBreak {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a number up to 40  but no more");
        int number = user.nextInt();

        int limit = 40;


        for(int i = 1; i <= number; i++){
            System.out.println(i);
            if ( number > limit){
                break;
            }
        }

        System.out.println("print a number");
        int number1 = user.nextInt();
        System.out.println("print second number");
        int number2 = user.nextInt();

       int sum = number1 + number2;

       for(int i = 1; i<=sum; i++){
           if( sum>=45){
               break;
           }
           System.out.println(i);
       }







    }


}
