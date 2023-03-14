package scanner.Practice;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);

        System.out.println("enter number1 ");

        int num1 = user.nextInt();

        System.out.println("enter number 2");

        int num2 = user.nextInt();

        System.out.println("enter number 3");

        int num3 = user.nextInt();

        if(num1 >num2 && num1> num3){
            System.out.println("num1 is bigger ");
        }else if( num2 > num1 & num2 > num3){
            System.out.println("number 2 is bigger");
        }else if (num3> num1 && num3> num2){
            System.out.println("number 3 is bigger");

        }else {
            System.out.println("play by my rules ");
        }






    }
}
