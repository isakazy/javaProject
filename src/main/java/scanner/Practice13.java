package scanner;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("ask age of the user");

    int age = user.nextInt();

    if(age <=21 ){
    System.out.println("you are too young");
        }else if( age >= 21){
        System.out.println("you are good to ger bear");

    }
    }


}
