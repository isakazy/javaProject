package scanner;

import java.util.Scanner;

public class MyPractice10 {
    public static void main(String[] args) {


        Scanner user = new Scanner(System.in);

        int grade = user.nextInt();

        if(grade>=0 & grade<=20){
            System.out.println("bad study more");
        }else if(grade>=21 & grade<=40){
            System.out.println("still bad work harder");}





    }
}