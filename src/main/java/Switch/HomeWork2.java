package Switch;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter a week day");
        String day = user.nextLine();

switch(day){
    case "monday":
        System.out.println("weekday");
        break;
    case "tuesday":
        System.out.println("weekday");
        break;
    case "wednesday ":
        System.out.println("weekday");
        break;
    case "thursday":
        System.out.println("weekday");
        break;
    case "friday":
        System.out.println("weekday");
        break;
    case "saturday":
        System.out.println("weekend");
    case "sunday":
        System.out.println("weekend");


}
    }
}
