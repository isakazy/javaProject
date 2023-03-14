package scanner;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

Scanner user = new Scanner(System.in);
System.out.println("enter temperature");
Double temp = user.nextDouble();
System.out.println("is it raining? true/false");
boolean isRaining = user.nextBoolean();

if(temp<0){
    System.out.println("it is freezing outside, wear a heavy coat, glaves and hat");
}else if(temp>=0 && temp<=10  && isRaining ){
    System.out.println("it is chilly and rainy wear a raincoat, boots and scarf");
}else if (temp>=0 && temp<=10  &&  !isRaining){
    System.out.println("it is chilly outside, wear a jaket, gloves and hat");
}else if (temp <=11 && temp<=20  && !isRaining){
    System.out.println("it is cool outside wear a light jacket and comfortable shoes");
}else if ( temp>=20  &&  isRaining){
    System.out.println("it is worm and rainy wear a light jacket shorts and sandals ");
}else if(temp>20 && !isRaining){
    System.out.println("its warm outside wear a t-shirt shorts and comfortable shoes ");
}
    }
}
