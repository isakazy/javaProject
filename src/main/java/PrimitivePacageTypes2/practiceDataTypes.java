package PrimitivePacageTypes2;

public class practiceDataTypes {

    public static void main(String[]args){

        /*
        float and double are variables that store decimal numbers
        double is larger that float
        also double is the most precise number
        java thinks that all floating numbers are double, to make sure that float is float put upperF

         */
        double priseOfBread=2.99;
        double priseOfApple=4.99000099998887776666666667777888889900000998777;
        System.out.println(priseOfApple);
        priseOfApple=priseOfBread;
        System.out.println(priseOfBread);

        byte byte1=2;
        short short1=5;
        int int1=7;
        long long1=345;
        float float1=354564F;
        /*
        both double and float can store both numbers
        each of the variables(byte,short,int,long,float,double) are the primitive data types (numbers)
         and double are not whole numbers(floating numbers)
         whole number(1,2,4,6,7,8,0)
         floating numbers(4.6,5.5 2.4)
         decimal numbers (1234567890)
         binary numbers(1,0)


         89.8911511 WHEN (89 IS decimal and 8911511 is fractional)




         */
        byte1=(byte)short1;
        System.out.println(byte1);
        float1=long1;
        System.out.println(long1);











    }
}