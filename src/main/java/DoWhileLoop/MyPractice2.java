package DoWhileLoop;

import java.util.Objects;
import java.util.Scanner;

public class MyPractice2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int number=0;

   do {
       System.out.println("enter a negative number");
       number = user.nextInt();
       if(number >=0 ){
           System.out.println("the number is positive, enter a negative number");
       }

   }while ( number > 0);










    }

}
