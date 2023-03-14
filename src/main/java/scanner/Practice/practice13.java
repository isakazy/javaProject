package scanner.Practice;

import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter a number");

        int   number = user.nextInt();

        if(number % 2 == 0  && number <=0){
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }




    }


}
