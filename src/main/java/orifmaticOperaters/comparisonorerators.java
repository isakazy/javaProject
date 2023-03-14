package orifmaticOperaters;

public class comparisonorerators {

    public static void main(String[] args) {

        ///> more than
        ///<less then
        ///>= more or equal
        ///== equal
        ///! not equal
        byte potato=5;
        byte fries=10;
        System.out.println(potato>fries);//false
        System.out.println(potato<fries);//true
        System.out.println(potato>=fries);//false
        System.out.println(potato==fries);//false




        byte man=24;
        byte women=55;
       System.out.println(man>women);


        short dog=100;
        short cat=120;
System.out.println(dog==cat);

        int stone=65;
        int car= 32;
        System.out.println(stone> car);


        long mouse=456;
        long ant=15000000;
        System.out.println(ant>mouse);

        System.out.println(ant=dog);
        System.out.println(man==dog);
        System.out.println(women==cat);
        System.out.println(cat>stone);
        System.out.println( cat==ant);



        System.out.println(1+3);//4
        System.out.println(1+2+"hello");//3hello
        System.out.println("hello"+1+2);//hello+1+2 Java reads top to down, left to right
        System.out.println("hello" +3+ "true");///



    }


}
