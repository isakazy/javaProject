package strings;

public class stringEquals {
    public static void main(String[] args) {
        String country="usa";
        String county2="usa";
        String country3= new String("usa");
        System.out.println(country==county2);//true
        System.out.println(country==country3);//false
        System.out.println(country==country3);
        ////// when we use == to see if they are equal it sees if the string adress is same so country and country3 are not the same
        /////but if we use .equal it will compare the value itself.
        System.out.println(country.equals(country3));////true
        System.out.println(country==country3);///false
    }
}
