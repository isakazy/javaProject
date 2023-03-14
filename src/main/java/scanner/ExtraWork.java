package scanner;

import java.util.Scanner;

public class ExtraWork {
    public static void main(String[] args) {


int number = 7;
boolean IsPrime = true;
for(int a =2;  a< number; a++){
    if(number % a == 0){
         IsPrime = false;
         break;
    }
}if(IsPrime ){
            System.out.println("the number is prime");
        }else;{
            System.out.println("the number is not prime");
        }



         }

    }

