package DoWhileLoop;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        boolean YesNo = true;
        do {
            System.out.println("enter a number");
            int number = user.nextInt();
            System.out.println("enter an Arithmetic Operator");
            String ArithmeticOperator = user.next();
            System.out.println("enter second number");
            int number2 = user.nextInt();

            if (ArithmeticOperator.equalsIgnoreCase("+")) {
                System.out.println(number + "+" + number2 + "=" + (number + number2));
            } else if (ArithmeticOperator.equalsIgnoreCase("-")) {
                System.out.println(number - number2 + "=" + (number - number2));
            } else if (ArithmeticOperator.equalsIgnoreCase("/")) {
                System.out.println(number / number2 + "=" + (number / number2));
            } else if (ArithmeticOperator.equalsIgnoreCase("*")) {
                System.out.println(number * number2 + "=" + (number * number2));
            } else if (ArithmeticOperator.equalsIgnoreCase("%")) {
                System.out.println(number % number2 + "=" + (number % number2));

            }
            System.out.println("would you like to continue? if YES print Y, if NO, print N");
             YesNo = user.hasNextBoolean();


        }while(YesNo);

    }
}
