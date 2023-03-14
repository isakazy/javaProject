package DoWhileLoop;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Scanner;

public class HomeWorkSumOfOddIntegers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a number");
int number= user.nextInt();

    int counter= 0;
        do{
            if(number % 2!=0) {
                System.out.println(number);
            }
            number--;
           counter=  counter+ number;

           }while(number>=0);
        System.out.println( counter);



















}}