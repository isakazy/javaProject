package scanner.Practice;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a number");

        int a = user.nextInt();
        System.out.println("enter second number");
        int b = user.nextInt();

        if(a>=0 && b >=0){
            System.out.println("both a and b are positive");
        }else if (a>0 || b>0){
            System.out.println("eather a or b is positive");
        }else if( a<0 && b<0 ){
            System.out.println(" both a and b are negative");
        }else if (a>0 && b<0) {
            System.out.println("a is positive and b is negative");
        }










    }
}