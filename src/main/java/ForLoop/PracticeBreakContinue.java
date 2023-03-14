package ForLoop;

import java.util.Scanner;

public class PracticeBreakContinue {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a positive integer");
        int number = user.nextInt();

    for (int a = 0; a <= number; a++) {
        if (a % 3 != 0) {
            continue;
        } else if (a % 5 == 0) {
            continue;
        } else if (a <3) {
            System.out.println("there are  no integers that meat the criteria ");
        }else if(a<=0){
            System.out.println("the number is negative, please enter a positive number");
        }
        System.out.println(a);

    }








        }

    }