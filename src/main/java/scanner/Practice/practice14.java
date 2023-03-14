package scanner.Practice;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter 1 number");
        double number = user.nextDouble();


        System.out.println("enter Arithmetic Operator  + - / * ");
        String Operator = user.next();


        System.out.println("enter 2 number");
        double number2 = user.nextDouble();

        if (Operator.equals("+")) {
            System.out.println(number + "+" + number2 + "=" + (number + number2));
        }else if (Operator.equals("-")){
            System.out.println(number+ "-" +number2+ "=" +(number-number2));
        }else if (Operator.equals("/")){
            System.out.println(number+"/"+number2+ "="+ (number/number2));
        }else if (Operator.equals("*")){
            System.out.println(number+"*"+number2+ "="+(number*number2));
        }else if(Operator.equals("%")){
            System.out.println(number+"%"+number2+"="+(number%number2));
        }else {
            System.out.println("error");
        }















    }


}
