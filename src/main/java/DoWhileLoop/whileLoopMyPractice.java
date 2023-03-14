package DoWhileLoop;

import java.util.Scanner;

public class whileLoopMyPractice {
    public static void main(String[] args) {
        int a = 1;
        while( a <=10){
            System.out.println(a);
            a++;
        }



        int b= 1;
        while( b<=100){
        if ( b % 2==0){
            System.out.println(b);}
            b++;}




        int c = 1;
        while(c <=10){
            System.out.println("good morning");
            c++;
        }

        for( int d = 1; d<=10; d++){
            System.out.println("good morning everyone ");
        }

        int e =1;
 while( e<=100){
     if( e % 2 !=0) {
         System.out.println(e);
     }
     e++;
 }


 for( int f = 1; f<=100; f++){
     if (f % 2 !=0){
         System.out.println(f);

int j =1;
while( j<=31){
    System.out.println("january"+" "+j+" 2023");
    j++;
}
int prime =1;

while(prime<=100){
    if( prime % 7==0 && prime % 1==0){
        System.out.println( prime+" "+"the number is prime ");
    }else {
        System.out.println(prime+" "+"the number is not prime");
    } prime++;
}

Scanner user = new Scanner(System.in);
         System.out.println("enter a number" );
         int number = user.nextInt();
boolean IsPrime = true;
int iterator = 2;
while ( iterator<number){
    if( number % iterator == 0){
        IsPrime = false;
        break;
    }iterator++;
}
if (IsPrime){
    System.out.println("the number is prime");
}else {
    System.out.println("the number is not prime");
}




     }
 }










    }
}
