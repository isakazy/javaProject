package strings;

public class homeworkPracticeEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello World!";
        String hello3 = new String ("Hello world");

        System.out.println(hello1.equals(hello2));
        System.out.println(hello1.equals(hello3));
        System.out.println(!hello1.equals(hello2));
        hello1.toLowerCase();
        hello2.toLowerCase();
        System.out.println(hello1.equals(hello2));
        hello1.toUpperCase();
        hello3.toUpperCase();
            System.out.println(hello1.equals(hello3));






    }
}
