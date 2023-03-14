package scanner;

import java.util.Scanner;

public class gradingClass {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        int grade = scanner.nextInt() ;

        System.out.println("grade 0 to 100");
        if(grade<=20 ){
            System.out.println("bad, study more");

        }else if (grade<=40 & grade>=20){
            System.out.println("ok, study more");
        }else if(grade>=40 & grade<=60){
            System.out.println("very good, keep up");

        }else if(grade<=85 &  grade<=95){
            System.out.println("perfect,good job");

        }else if(grade>=96  & grade<=100){
            System.out.println("exaptional, proud of you ");
        }




    }
}
