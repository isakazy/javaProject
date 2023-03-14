package orifmaticOperaters;

public class compoundOperatores {
    public static void main(String[] args) {

        int a =5;
        a++;/// it means a+1 so it is 6
        a++;/// now it is 7 because we added one more (just updated)
        a++;
        System.out.println(a);
        // now a equals 8 so if i
        a--;//7
        System.out.println(a);

        int age = 18;
        System.out.println(age++);
        System.out.println(age);// 18 i will only get the result after i print it (post increment)

        int price=20;
        System.out.println(++price);// 21 pre increment
        /*
        compound operators
        int=5
        a++  post increment
        ++a pre increment
        a--post decrement
        --a pre decrement

         */
        int money=20;
        money+=3;//money=money=5(20+3)
        System.out.println(money);


    }


}