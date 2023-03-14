package ifElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter zipcode");
        int ZipCode= user.nextInt();

        if((ZipCode+"").length()==5  && !(ZipCode+"").contains("9") && !(ZipCode+"").startsWith("0")){
            System.out.println("the entered ZipCode is valid");
        }else{
            System.out.println("zip code is not valid");
        }

    }
}
