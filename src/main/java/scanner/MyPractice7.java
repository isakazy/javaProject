package scanner;

import java.util.Scanner;

public class MyPractice7 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);


        System.out.println("enter month of your birth");

        String time = user.nextLine();
        if(time.equals("january") && time.equals("february") && time.equals("december")){
            System.out.println("you were born in winter");
        }else if(time.equals("march") && time.equals("april") && time.equals("may")){
            System.out.println("you were born in spring");
        }else if ( time.equals("june") && time.equals("july") && time.contains("august")){
            System.out.println("you were born in summer");
        }else if (time.equals("september") && time.equals("october") && time.equals("november")){
            System.out.println("you were born in fall");

        }








    }
}
