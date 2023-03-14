package ForLoop;

import java.util.Scanner;

public class MyPracticeContinue {
    public static void main(String[] args) {


        for(int i = 1; i<=10; i++){
            if( i==5){
                continue;
            }System.out.println(i);

        }

for(int a = 1; a<=100; a++){
    if( a % 2 ==0){
        continue;
    }
    System.out.println(a);
}

for(int b = 1; b<=100; b++){
    if(b /3==0){
      continue;
    }  System.out.println(b);
}

Scanner user = new Scanner(System.in);
        System.out.println("enter a negative number");
        int negative = user.nextInt();
        System.out.println("enter a positive number ");
        int positive = user.nextInt();

        for(int a  = negative; a<= positive; a++){
            if(a <0 && a % 2==0){
                continue;
            }else if( a> 0 && a % 2 !=0 ){
                System.out.println(a);
            }
        }













    }
}
