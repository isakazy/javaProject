package scanner;

import java.util.Scanner;

public class MyPractice3 {
    public static void main(String[] args) {
        Scanner isa = new Scanner(System.in);


        int a = isa.nextInt();

        int b = isa.nextInt();
        System.out.println("enter first number ");

        int c = isa.nextInt();
        System.out.println("enter second number");

        int d = isa.nextInt();
        System.out.println("enter third number");

        System.out.println("the summ" + (a*b*c));

    }
}
