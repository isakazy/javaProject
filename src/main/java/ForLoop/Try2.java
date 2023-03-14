package ForLoop;

import java.util.Scanner;

public class Try2 {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        System.out.println("enter a positive number");
        int number = user.nextInt();

        for(int a = 0 ;  a <=number; a++){
         if( a % 3 !=0 ) {
             continue;
         }else if( a % 5==0){
             continue;
         }
            System.out.println(a);


         }

         }

        }



