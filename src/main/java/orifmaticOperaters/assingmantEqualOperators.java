package orifmaticOperaters;

public class assingmantEqualOperators {
    public static void main(String[] args) {


        // assigment  operator when you give value to variable
        //==equal equal

        int number1 =10;// assignment
        int numb2 = 8;
        System.out.println(number1==numb2);

        boolean isequal = 100==101;

        boolean isEven;
        // we wanna check if the number can be devided by 2 isEven 80%2==0;

        boolean number =500==550;
        System.out.println(number);

        double kote=453534323;
        double sancho=243424123;
        boolean dom=kote==sancho;
        System.out.println(dom);
        boolean dvor=sancho==kote;
        System.out.println(dvor);
        boolean horosho=kote>sancho;
        System.out.println(horosho);
        System.out.println(kote+"/"+sancho+"="+kote/sancho);
        double pokrovka = kote-sancho;
        System.out.println(pokrovka);
        boolean isa = kote < sancho;
        System.out.println(isa);
        isa = kote==sancho;
        System.out.println(isa);
        isa=sancho==kote;
        System.out.println(isa);
        isa=sancho>kote;
        System.out.println(isa);
        isa=kote>sancho;
        System.out.println(isa);
        System.out.println(horosho==dvor);

        String practice=" ya tvoi rot ebal pidor";
        System.out.println(practice);
        String practice2= "idi na hui suka sam pidor";
        System.out.println(practice2);
        System.out.println(practice+"    "+practice2);

        practice= "ne materise";
        practice2= "horosho, ty toje";
        System.out.println(practice2);

        char code='3';
        char code2= '4';
       int code3 = code+code2;
       System.out.println(code3);///// why is it 103?



        int code5 = 707654;
        int code6 = 2334555;
       int code7=code5%code6;
       System.out.println(code7);
       code7 = code5 % 2;
       code7= 707654;
       int code8=code6%2;
       System.out.println(code8);
       System.out.println(233454%2);


       double big= 342453454646D;
       double bigger= 4354657687907897867576576567574564646D;
       boolean letsSee= big==bigger;
       System.out.println(letsSee);
       boolean letsSee2= bigger>big;
       System.out.println(letsSee2);




       int numb =300;
       int num2= 534;
       int num3 = 234;
       int res= numb+num2*num3;
       System.out.println(res);
       int res2= (numb+num2)*num3;
       System.out.println(res2);


       int a = 345;
       int b = 234;
       int c =  a % b;
       System.out.println(c);
       int d = c % 2;
       System.out.println(d);

       int temp = 15;
        if (temp>30){
        System.out.println("it is hot outside");


        }
         else if(temp>=20&& temp<=30){
          System.out.println("it is warm outside");

        }

         else{
             System.out.println("it is cold outside");
        }

         int speed = 80;
         if(speed>55){
             System.out.println("you are speeding");
         }

         else if (speed >=50 && speed <=55){
             System.out.println("you are driving good");

         }
           else {
               System.out.println("you are too slow");
         }


           int kg=63;
           if (kg>80){
               System.out.println("you are fat");
           }
            else if (kg>=70 && kg<=75){
                System.out.println("you look good");



        }
            else{

                System.out.println("you are skinny bith");
           }












    }

}
