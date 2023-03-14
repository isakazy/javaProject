package whileLoop;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        int number;
do {
    System.out.println("enter a number");
     number = user.nextInt();
    int sum = 1;
    for (int a = number; a > 1; a--) {
        number = sum *= a;

    }System.out.println(number);
    if (number ==0){
        System.out.println("input must be positive, please try again ");
    }else if( number <0){
        System.out.println("input must be positive, please try again");
    }

}while(number >= 0);





    }
}
