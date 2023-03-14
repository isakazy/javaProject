package strings;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        String example = "i go to school every day";
        System.out.println(example.endsWith("day"));

        System.out.println(example.indexOf('l'));
        System.out.println(example.substring(14));

        System.out.println(example.replace("day","week"));

        System.out.println(example.indexOf('s'));
        System.out.println(example.indexOf('l'));
        System.out.println(example.substring(8,14));


        System.out.println(example.indexOf('y'));

        System.out.println(example.startsWith("i"));

        System.out.println(example.replace('i','u'));

        System.out.println(example.indexOf("every"));

        System.out.println(example.toUpperCase());








    }
}
