package ForLoop;

import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);


        System.out.println("print a number");
        int number = user.nextInt();

        for(int a = number;  a>1; a--){
            number *= a ;

        }
        System.out.println(number  );






        System.out.println("enter a number");
     int c = user.nextInt();
     int sum = 0;
     for(int d = c; d>0; d/=10){
         sum += d % 10;
     }
        System.out.println(sum);




     for( int e = 100; e>=1; e--){
         if (e % 2 == 0 ){
             continue;
         }
         System.out.println(e);
     }


        for(int m = 1; m <=31; m++ ){
            System.out.println("march"+" "+m+" "+"2023");
        }


for( int f = 1; f<=50; f++){
   if ( f % 8==0){
       System.out.println(f);
   }else {
       continue;
   }
    }

}



    }



