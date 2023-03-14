package strings;

public class stringPractice {
    public static void main(String[] args) {
        String str = "this is a random string for testing purposes";
        System.out.println(str.length());

        System.out.println(str.charAt(2));

        System.out.println(str.indexOf(41));

        System.out.println(str.replace('a','o'));

        System.out.println(str.replace(" ", ""));

        System.out.println(str.substring(10,16));

        System.out.println(str.toUpperCase().charAt(15) + "" +str.toUpperCase().charAt(14)+str.toUpperCase().charAt(13)+str.toUpperCase().charAt(12)+str.toUpperCase().charAt(11)+str.toUpperCase().charAt(10));












    }
}
