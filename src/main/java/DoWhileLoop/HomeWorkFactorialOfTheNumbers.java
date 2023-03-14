package DoWhileLoop;

import java.util.Scanner;

public class HomeWorkFactorialOfTheNumbers {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("enter a number");
        int number = user.nextInt();
        int sum= 1;


       do{
           for(int a =  number; a>=1; a--){
               sum = sum * a;
           }
           System.out.println(sum);
           if(number==0){
               System.out.println("please try again");
           }else if(number<0){
               System.out.println("please enter a positive number");
           }




       }while(sum<=number);


    }
}
