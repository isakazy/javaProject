package ForLoop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("enter any number");
        int limit = user.nextInt();


        for(int a = 0; a<=40;  a++){
           if(a>=40){
               break;
           }
            System.out.println(a);
        }




























    }
}
