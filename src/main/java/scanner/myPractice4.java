package scanner;

import java.util.Scanner;

public class myPractice4 {
    public static void main(String[] args) {
        Scanner isakazy = new Scanner(System.in);

        System.out.println("enter first number:");
        double a = isakazy.nextDouble();

        System.out.println("enter ArithmeticOperator + - / * % ");
        String ArithmeticOperator = isakazy.next();

        System.out.println("enter second number");
        double b = isakazy.nextDouble();

        if(ArithmeticOperator.equals("+")){
            System.out.println(a +"+"+ b+"="+(a+b));
        }else if(ArithmeticOperator.equals("-")){
            System.out.println(a+"-"+b+"="+(a-b));

        }else if(ArithmeticOperator.equals("/")){
            System.out.println(a+"/"+b+"="+(a/b));

        }else if(ArithmeticOperator.equals("*")){
            System.out.println(a+"*"+b+"="+(a*b));

        }else if (ArithmeticOperator.equals("%")){
            System.out.println(a+"%"+b+"="+(a%b));

        }else{
            System.out.println("operator is invalid");
        }




    }
}
