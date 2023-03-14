package strings;

public class practiceEqualsInStrings {
    public static void main(String[] args) {
        String hello1= "Hello World!";
        String hello2= "Hello world!";
        String hello3= new String ("Hello World!");
      boolean letsSee=!hello1.equals (hello2);
      System.out.println(letsSee);//used boolean and basically said to java "they are not equal" java says "true"
        boolean letsSee2= !hello1.equals (hello3);
        //// i tried all (!,equals,==)java kees saying true,so i will make a change
        //in one of the strings and make sure i get false (hope its not cheating)
        System.out.println(hello1.toUpperCase());
        boolean letsSee3= hello1.equals(hello3);
        System.out.println(letsSee3);/// ok it keeps saying true
        boolean letsSee4=!hello1.equals(hello3);
        System.out.println(letsSee4);//false

        System.out.println(hello1.equals(hello2));// false


        System.out.println(hello1.toLowerCase());
        System.out.println(hello2.toLowerCase());
        System.out.println(!hello1.equals(hello2));/// i got true by saying they are not equal... i dont understand(((
        //// they should have been equal.




        System.out.println(hello1.toUpperCase());
        System.out.println(hello3.toUpperCase());
        System.out.println(!hello1.equals(hello3));//// here again!! i dont understand they should have been equal


        String isa;
        String amanbaev;
       System.out.println("isa".concat("amanbaev"));






    }
}
