package scanner.Practice;

import java.util.Scanner;

public class AndOr {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter boolean : true/false");
        boolean a = user.nextBoolean();
        System.out.println("enter second boolean: true/ false");
        boolean b = user.nextBoolean();
        if(a == true && b == false ){
            System.out.println("a is true b is false");
        }else if(b== true && a == false){
            System.out.println("b is true a is false");
        }else if (b == false && a == false ){
            System.out.println("both are false ");
        }else if( a== true && b == true ){
            System.out.println("they are both true");
        }else if( a == true || b == true){
            System.out.println("eather a or b is true ");
        }else {
            System.out.println("system erro");

        }


    }
}
