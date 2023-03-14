package ifElse;

import java.util.Scanner;

public class HomeworkIfElse {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;
        if (num1 == num2 || num1 == num3) {
            System.out.println("two of the numbers are equal");
        } else {
            System.out.println("non of the numbers are equal");
        }

        int number = 9;
        int a = 3;
        int b = 5;
        if (number % a == 0 || number % b == 0) {
            System.out.println("multiple of 3 or 5");
        } else {
            System.out.println("not a multiple of 3 or 5");
        }

        int number1 = 4;
        int number2 = 3;
        if (number1 + number2 % 2 == 0) {
            System.out.println("the number is even");
        } else System.out.println("the number is odd");



        Scanner user = new Scanner(System.in);
        System.out.println("enter a prime number");
        int PrimeNumber = user.nextInt();

        System.out.println("enter a number");
        boolean IsPrime =true;

        int i =2;
        while(PrimeNumber< i ){
            number++;

        }if(PrimeNumber % i ==0){
            IsPrime= true;
        }











    }




      }







