package ifElse;

public class IfIf {
    public static void main(String[] args) {

        String weather = "warm and rainy";
        if (weather.equals("cold")) {
            System.out.println("stay home");
        } else if (weather.equals("hot")) {
            System.out.println("stay home");
        }
        else if (weather.contains("warm")){System.out.println("warm, go out");}
        else if (weather.contains("rainy")){System.out.println("stay home");}
        else{ System.out.println("party hard");}


        if(1<2){
            System.out.println("one is less than two");
        }if(1<3){
            System.out.println("one is less than three");
        }if (1<4){
            System.out.println("one is less than three");
        } if (1<5){System.out.println("one is smaller than 5");}
/////&& and




    }
}