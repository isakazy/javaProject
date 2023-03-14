package scanner;

import java.util.Scanner;

public class rockSvisersPaper {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);


        System.out.println("your move");

        String random = game.nextLine();

        System.out.println("my move");

        String my = game.nextLine();

        if (random.equals("stone") && my.equals("paper")){
            System.out.println("paper won");
        }else if(random.equals("stone") && my.equals("svisers")){
            System.out.println("stone won");
        }else if(random.equals("stone") && my.equals("stone")){
            System.out.println("you stupid?");
        }else if (random.equals("paper") && my.equals("svisers")){
            System.out.println("svisers won");
        }else if(random.equals("paper") && my.equals("stone")){
            System.out.println("paper won");
        }else if (random.equals("paper") && my.equals("paper")){
            System.out.println("you stupid or what?");
        }else if (random.equals("svisers") && my.equals("stone")){
            System.out.println("stone won");
        }else if(random.equals("svisers") && my.equals("paper")){
            System.out.println("svisers won");
        }else if(random.equals("svisers") && my.equals("svisers")){
            System.out.println("stop it");
        }else {
            System.out.println("not in the rul");
        }



    }
}
