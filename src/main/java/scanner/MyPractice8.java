package scanner;

import java.util.Scanner;

public class MyPractice8 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int speed = user.nextInt();
        boolean IsbirthsDay = user.nextBoolean();
        System.out.println("is it your birthsday?");


        if(speed<60){
            System.out.println("no ticket");
        }else if(speed>60 & speed<=80){
            System.out.println("medium ticket");
        }else if(speed>=80 & speed <= 100){
            System.out.println("big ticket");
        }else if(speed>100){
            System.out.println("arrest");
        }





    }

}
