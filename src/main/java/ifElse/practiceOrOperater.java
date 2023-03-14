package ifElse;

public class practiceOrOperater {
    public static void main(String[] args) {
        //// Or operator is used with booleans, and produses tru in case if at least one tru is found.

        String manu = "pizza, langman, tea, bread, cake, coffe, water";
       if (manu.contains("pizza,") & manu.contains("soda")){
           System.out.println("order pizza and soda");

        }if(manu.contains("tea") &  manu.contains("cake")){
           System.out.println("order dessert");}
       if(manu.contains("langman") & manu.contains("tea")){
           System.out.println("order langman and tea asian in here");
       }if(manu.contains("coffe") | manu.contains("smoothie")){
            System.out.println("breakfast time");
        }if(manu.contains("pizza") | manu.contains("pasta") ){
            System.out.println("italian day");
        }if (manu.contains("tea")& manu.contains("coffe")& manu.contains("water")& manu.contains("soda")){
            System.out.println("order only drinks");
        }if(manu.contains("langman") & !manu.contains("plov")){
            System.out.println("not uzbek restourant");
        }


        }
        }








