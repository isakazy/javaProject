package scanner;

import java.util.Scanner;

public class IntroToScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int numb1 = sc.nextInt();
        System.out.println("enter secont number");
        int num2 = sc.nextInt();
        System.out.println("the sum"+ (numb1 + num2));
    }
}
