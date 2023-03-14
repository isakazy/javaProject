package strings;

public class practiceSubString {
    public static void main(String[] args) {

        String firstName= "Jacob";
        String lastName= "coffe";
        String name1= firstName.substring(0,1)+"e"+lastName.substring(4);
        System.out.println(name1);

        System.out.println(lastName.substring(0,1)+"e"+"e");
        System.out.println(lastName.substring(0,1)+lastName.replace('f','c'));






    }
}
