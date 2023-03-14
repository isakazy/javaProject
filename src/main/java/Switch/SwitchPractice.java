package Switch;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter the number");
        int number = user.nextInt();

        switch(number){
            case 12,1,2:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("fall");
                break;
            case 9,10,11:
                System.out.println("winter");
            default:
                System.out.println("invalid");
        }













    }
}
