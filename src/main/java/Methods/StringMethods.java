package Methods;

import java.util.Locale;

public class StringMethods {
   static boolean IsSame(String str1, String str2){
       if(str1.equals(str2)) {
           return true;

       }return false;


   }

   String word1(String word, String word2){
       return (word + word2).toUpperCase();
   }
//=========================================================================
   int cellphone(String car, String ak){
       return (car + ak).length();
   }
//=======================================================================
   public static boolean numbers( int a){

       return a % 2 == 0;
   }

  public boolean number2 ( int b){
      return b % 10 == 0;
  }
//==========================================================================
   public static void table( int number ){
       for ( int a = 1; a<=10; a++){
           System.out.println(number + "*" +5+ "=" + (number*5));
       }

   }


  //==================================================================================
   public static int average( int a, int b, int c, int d){
       int sum = (a+b+c+d) / 4;
           return sum;

   }





   //===============================================================================================
   public static int numbers ( int  a, int b){
       if (a>b){
           System.out.println(a);
           return a;
       }else {
           System.out.println(b);
           return  b;
       }
   }


   public static int  str3  (int e ){
       int sum = 0;
       for(int a = 1; a <=e; a++){
           sum = sum + e;

       }  return sum;
   }




    public static void main(String[] args) {



       boolean letsSee = IsSame("hello","heloooooooooooo");
        System.out.println(letsSee);




        table(8);


        System.out.println(average(1,2,3,4));






        str3(5);
            System.out.println(10);







    }





















}
