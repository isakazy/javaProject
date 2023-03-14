package scanner;

import java.util.Scanner;

public class practice15 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        // f = c *9/5+32

        System.out.println("enter temperature");
          double temp = user.nextDouble();
          temp = temp * 9 / 5 + 32;
        System.out.println(temp);







    }

}
