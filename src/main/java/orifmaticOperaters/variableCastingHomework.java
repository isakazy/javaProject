package orifmaticOperaters;

public class variableCastingHomework {
    public static void main(String[] args) {
        byte  myByte= 10;
        short myShort= 100;
        int myInt=500;
        long myLong=1000;
        float myFloat=2000L;
        double myDouble=5000;

        myByte=(byte)myShort;
        System.out.println(myByte);
        myInt=myShort;
        System.out.println(myInt);
        myLong=myShort;
        System.out.println(myLong);
        myFloat=myShort;
        System.out.println(myFloat);
        myDouble=myShort;
        System.out.println(myDouble);

        myShort=(short)myByte;
        System.out.println(myShort);
        myInt=myByte;
        System.out.println(myInt);
        myLong=myByte;
        System.out.println(myLong);
        myFloat=myByte;
        System.out.println(myFloat);
        myDouble=myByte;
        System.out.println(myDouble);

        myByte=(byte)myInt;
        System.out.println(myByte);
        myShort=(short)myInt;
        System.out.println(myShort);
        myLong=myInt;
        System.out.println(myLong);
        myFloat=myInt;
        System.out.println(myFloat);
        myDouble=myInt;
        System.out.println(myDouble);

       myByte=(byte)myLong;
       System.out.println(myByte);
       myShort=(short)myLong;
       System.out.println(myShort);
       myInt=(int)myLong;
       System.out.println(myInt);
       myFloat=myLong;
       System.out.println(myFloat);
       myDouble=myLong;
       System.out.println(myDouble);

       myByte=(byte)myFloat;
       System.out.println(myByte);
       myShort=(short)myFloat;
       System.out.println(myShort);
       myInt=(int)myFloat;
       System.out.println(myInt);
       myLong=(long)myFloat;
       System.out.println(myLong);
       myDouble=myFloat;
       System.out.println(myDouble);


       myByte=(byte)myDouble;
       System.out.println(myByte);
       myShort=(short)myDouble;
       System.out.println(myShort);
       myInt=(int)myDouble;
       System.out.println(myInt);
       myLong=(long)myDouble;
       System.out.println(myLong);
       myFloat=(float)myDouble;
       System.out.println(myFloat);




























    }
}
