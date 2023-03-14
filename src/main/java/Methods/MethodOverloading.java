package Methods;

public class MethodOverloading {

    /*
    method names have to be unique. we can npt have two or more
    methods with the same name.
   when two or more method have same signature and different parameters it is called method overloading
     */

    public int getAreaOfRectangle(int a, int b) {
        return a * b;

    }

    public int getPerimeter(int a, int b) {
        return (a + b) * 2;

    }

    public int getPerimeter(long a, long b) {
        return (int) (a + b) * 2;

    }


    public int getPerimeter(double a, double b) {
        return (int) (a + b) * 2;

    }
}