package ifElse;

public class practiceBoolean {
    public static void main(String[] args) {
        int a = 2313;
        int b = 1212;
        boolean see= b>a;
        System.out.println(see);
        see= b<a;
        System.out.println(see);
        see=b==a;
        System.out.println(see);

        String isakazy= "Amanbaev";
        String Maksim= "kovynev";
         boolean f = isakazy.startsWith("a");
         boolean j= Maksim.endsWith("p");
         boolean l = isakazy.isEmpty();
         boolean m= Maksim.contains("K");
         boolean q= isakazy.length( )>Maksim.length();
         boolean w= Maksim.equals(isakazy);
         boolean p= Maksim.isEmpty();
         boolean k= !Maksim.equals(isakazy);
         boolean fsa= !isakazy.isEmpty();
         System.out.println(fsa);
         isakazy= "Amanbaeva".toUpperCase();
         Maksim= "kovynev".toUpperCase();
         boolean sa= isakazy==Maksim;
         System.out.println(sa);
         /*
         if (2<10) System.out.println(hello)else System.out.println(bye bye)
         if 2 is less than 10   we get the hello result




          */















    }

}