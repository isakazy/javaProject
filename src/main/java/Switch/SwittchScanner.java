package Switch;

import java.util.Scanner;

public class SwittchScanner {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);


        System.out.println("enter grade");
        String grade= user.nextLine();
        switch (grade){

              case "b":
               System.out.println("good job");
               break;
               case "a":
                   System.out.println("perfect");
                break;
                 case "c":
                 System.out.println("work harder");
                 break;
            case "f":
                System.out.println("poor work more");










        }




    }
}
