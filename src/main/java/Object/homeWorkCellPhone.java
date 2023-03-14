package Object;

public class homeWorkCellPhone {

    String phone;
    int price;
    int memory;

public void ring (){
    System.out.println(phone+" "+"rings when you call ");
}

public void turnOn(){
    System.out.println("to turn on the"+" "+phone+" "+"push, and hold power button");
}

public void turnOff(){
    System.out.println("to turn off the"+" "+phone+ " "+"push, and hold power button");
}







    public static void main(String[] args) {



    homeWorkCellPhone iphone = new homeWorkCellPhone();
    iphone.phone= "iphone 13 mini";
    iphone.memory = 512;
    iphone.price = 900;



    iphone.turnOn();
    iphone.turnOff();
    iphone.ring();





    }

}

