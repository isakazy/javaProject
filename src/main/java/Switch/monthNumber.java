package Switch;

import java.util.Scanner;

public class monthNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a number of the month");
        int number = user.nextInt();

        if(number ==3 || number ==4 || number==5){
            System.out.println("it is spring");
        }else if(number==6 || number ==7 || number ==8){
            System.out.println("it is summer");
        }else if(number== 9 || number ==10 || number ==11){
            System.out.println("it is fall");
        }else{
            System.out.println("it is winter ");
        }












    }
}
