package ifElse;

public class ifElseDayTwo {
    public static void main(String[] args) {
       int day = 7;
       if( day==1){
           System.out.println("monday");

       } else if (day==2){

       System.out.println("teusday");}

       else if(day==3){
           System.out.println("wednesday");
       }
      else if(day==4){
          System.out.println("thursday");

       }else if ( day==5) {
           System.out.println("friday");


       } else if(day==6){
           System.out.println("Saturday");
       }else if (day==7){
          System.out.println("sunday");

       }else{
           System.out.println("wrong day");
       }

      String dayofweek= "MONDAY";
     if(dayofweek.equalsIgnoreCase("monday")){
         System.out.println('1');

     }else if(dayofweek.equalsIgnoreCase("teusday")){

     System.out.println('2');}
     else if ( dayofweek.equalsIgnoreCase("wednesday")){
         System.out.println('3');
        } else if (dayofweek.equalsIgnoreCase("thirsday")){
         System.out.println('4');

     }else if (dayofweek.equalsIgnoreCase("friday")){
         System.out.println('5');

     }else if (dayofweek.equalsIgnoreCase("saturday")){
         System.out.println('6');

     }else if(dayofweek.equalsIgnoreCase("sunday")){
         System.out.println('7');

     }


     byte time = 18;
     if(time>=9 && time <=17){
         System.out.println("work hours");

     }else if (time>=7 && time <=9 || time >=18&& time <=19){
         System.out.println("commute to work");
     } else if(time>=6 && time<=8){System.out.println("it is breakfast time ");

     }else if (time>=12 && time<=13)
        {
            System.out.println("its lunch time");
        } else if(time<=20 && time<=22){
         System.out.println("dinner time");

     }else if (time>=3 && time<=5){
         System.out.println("its play time ");

     }







       }
        }


