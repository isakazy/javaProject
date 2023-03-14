package Methods;

public class HomeWorkCalculator {


    public void  plus (int a, int b){
        System.out.println(a +b);
    }


    public  void  subtract(int c, int d) {
        System.out.println(c - d);
    }

    public void  division(int e, int f) {
        System.out.println( e / f);
        if ( f <= 0 ){
            System.out.println("can not divide by 0");
        }
    }

    public void multiply(int g, int h) {
        System.out.println(g * h);

    }

    public void  modulus(int i, int f) {
        System.out.println(i % f);
    }



    int cake(int v, int y){
        return v+ y;
    }

    public static void main(String[] args) {

        HomeWorkCalculator result = new HomeWorkCalculator();


        result.plus(3,6);
        result.subtract(10,5);
        result.multiply(60,2);
        result.division(10,6);
        result.modulus(20,4);
        result.cake(20,55);




    }
}

