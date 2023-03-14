package ForLoop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {




        for(int a = 1; a<=10; a++){
            if(a==5){
                continue;

            }System.out.println(a);
        }



        for(int b =1; b<=100;  b++){
            if (b % 2==0){

                continue;
            }
            System.out.println(b);
        }

for(int c = 1; c<=200; c++){
    if(c % 3==0){
        continue;
    }
    System.out.println(c);
}


Scanner user= new Scanner(System.in);
        System.out.println("enter a negative number");
int number = user.nextInt();
        System.out.println("enter a positive number");
int number2 = user.nextInt();

for(int a = number; a <=number2; a++ ){
    if(number %2==0 && number<=0){
        continue;

    }else if(number %2!= 0){
        break;
    } System.out.println(a);


}

























    }
}
