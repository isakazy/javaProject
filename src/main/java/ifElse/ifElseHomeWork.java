package ifElse;

public class ifElseHomeWork {
    public static void main(String[] args) {

        int number = 40;
        if (number>=1){
            System.out.println("positive");
        }else if( number<=-1){
            System.out.println("negative");
        }else System.out.println("zero");

        int year =2019;

        if(year % 4 == 0 || year % 100!= 0  && year % 400 == 0 ){
            System.out.println("the year is leap");
        }else{
            System.out.println("the year is not leap");
        }



        int number1 = 3;
        int number2 = 123;
        if(number1>=number2){
            System.out.println("3 IS LARGER THAN 123");
        }else if ( number2>=number1){
            System.out.println("123 is larger than3");
        }else {System.out.println("error");}


        double tempInFahrenheit = 77.3;
        if(tempInFahrenheit<=32){
            System.out.println("it is freezing");
        }else if (tempInFahrenheit>=212){
            System.out.println("it is boiling hot");
        }else {
            System.out.println("in the middle");
        }
       byte month = 6 ;
        if (month>=3 & month<=6){
            System.out.println("it is spring");
        }else if (month>=6 & month<=9){
            System.out.println("it is summer");
        }else if(month>=9 & month<=12){
            System.out.println("it is winter");

        }else{
            System.out.println("it is winter");

        }


    }
}
