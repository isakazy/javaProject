package Object;

public class PracticeMethodCreation {
    public static int sum(int a, int b) {
        return a + b;
    }

    public String letter(String house) {
        return house.toLowerCase();
    }

    public double davide(int c, int d) {
        return (double) c / d;
    }
//public static boolean civic (String civic) {
    //   for (int a = 1; a <= civic.length() / 2; a++) {
    //       if (civic.charAt(a) == civic.length() -a -1) {
    //     return true;
    //       }
    //   }return false;
//}



    public double  multiply( double a ){
        return a * 100;

}

    public static void main(String[] args) {
        PracticeMethodCreation result = new PracticeMethodCreation();
        System.out.println(sum(8,20));







    }
}
