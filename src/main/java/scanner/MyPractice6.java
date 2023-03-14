package scanner;

import java.util.Scanner;

public class MyPractice6 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String season = user.nextLine();
        System.out.println("enter month:");
        if(season.equals("january") || season.equals("fabruary") || season.equals("december")){
            System.out.println("winter");
        }else if(season.equals("march") || season.equals("april") || season.equals("may")){
            System.out.println("spring");
        }else if(season.equals("june") || season.equals("july") || season.equals("august")){
            System.out.println("summer");
        }else if(season.equals("september") || season.equals("october") || season.equals("november")){
            System.out.println("fall");
        }else {
            System.out.println("not within the season");

        }
    }
}
