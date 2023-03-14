package ForLoop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("enter any number");
        int number1 = user.nextInt();
        System.out.println("enter second number");
        int number2 = user.nextInt();
        int sum = number1 + number2;


        for(int i = 1; i<= sum; i++){
            if(i == 45){
                break;
            }
        }









    }
}
