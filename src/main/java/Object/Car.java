package Object;

public class Car {

    String model;
    int year;
    int price;
    String color;
    String drive;
    int speed;



    public void drive(){
        System.out.println(model+"drives very smooth");
    }
    public void year(){
        System.out.println(model+"is"+year);
    }

    public void price(){
        System.out.println("the+" +model+"costs"+ price);
    }

    public void model(){
        System.out.println("the cars model is"+ model);
    }

    public void speed(){


        System.out.println("the+" +model +"can speed up to"+ speed);
    }public void color(){
        System.out.println("the color of"+ model+"isa"+ color);
    }



}
