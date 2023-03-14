package DoWhileLoop;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        int a =1;
        do{
            System.out.println(a);
            a++;
        }while( a<=10);



        int b=1;
        do{
            System.out.println(b);
            b++;
        }while (b<=100);


            Scanner user = new Scanner(System.in);
        System.out.println("enter a number");
        int number = user.nextInt();

        do{
            if (number % 2 ==0){
                System.out.println(number);
            }number++;
        }while(number<=100);



int d = 1;
do{
    if (d % 2 != 0){
        System.out.println(d);
    }d++;
}while(d<=100);



    }
}
