package Object;

public class Animal {

    String type;
    boolean isMammal;
    boolean isCarnivare;
    int age;
    String habitat;


    public void type(){
        System.out.println(type+ "isCarnovore"+ "IS eating");

    }public void isMammal(){
        System.out.println(true);

    } public void isCarnivare(){
        System.out.println(false);

    }public void age(){
        System.out.println("the animal is"+ " " +age);

    }public void habitat(){
        System.out.println("the animal lies in the "+ " "+habitat);
    }


    public static void main(String[] args) {


        Animal tiger = new Animal();

        tiger.isMammal();
        tiger.habitat();
        tiger.type();
        tiger.age();

    }

    }

