package MethodsOverloading;

public class isPrime {

    public boolean isPrime(int number) {
        for (int a = 2; a <= number; a++) {
            if (number % a == 0) {

            }
        }return false;

    }


    public boolean isPrime(short number){
        for (int a = 2; a <= number; a++){
            if (number % a==0){

            }
        }return false;
    }

    public boolean isPrime(long number){
        for(int a = 2; a<= number; a++){
            if( number % a == 0){

            }
        }return false;
    }

    public boolean isPrime(double number){
        for (int a = 2; a<= number; a++){
            if(number % a == 0){

            }
        }return false;
    }



}

