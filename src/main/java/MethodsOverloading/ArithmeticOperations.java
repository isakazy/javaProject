package MethodsOverloading;

public class ArithmeticOperations {

    public int sumOfTwo(int a, int b) {
        return a + b;

    }

    public int sumOfTwo(int a, int b, int c) {
        return a + b + c;
    }

    public int sumOfTwo(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;

    }

    public int sumOfTwo(int a, int b, int c, int d, int f, int g) {
        return (a + b + c + d + f + g) / 6;


    }

    public int GetAreaOfTriangle(int base, int high) {
        return (base * high) / 2;
    }

    public double GetAreaOfTriangle(int a, int b, int c) {
        int half = (a + b + c )/ 2;
       return  Math.sqrt(half*(half -a )* (half -b)* (half-c));
    }
}