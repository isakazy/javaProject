package scanner;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner user = new Scanner("System.in");
        System.out.println("enter first number:");
        double numb1 = user.nextDouble();
        System.out.println("enter arithmetic Operator / * + %");
        System.out.println("enter secont number:");
        String arithmeticOperator = user.next();

        double number2 =user.nextDouble();
        if(arithmeticOperator.equals("/")){

            System.out.println(numb1 + "/" + number2 + "=" + (numb1 / number2));}
        else if (arithmeticOperator.equals("*")){
            System.out.println(numb1+"*"+number2+"="+numb1*number2);
        }else if (arithmeticOperator.equals("+")){
                System.out.println(numb1+"+"+number2+"="+numb1+number2);


        }else if (arithmeticOperator.equals("-"))
                System.out.println(numb1+"-"+number2+"="+ (numb1-number2));





















    }
}