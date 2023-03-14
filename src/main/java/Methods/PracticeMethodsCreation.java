package Methods;

import java.util.Locale;

public class PracticeMethodsCreation {

    public static int multiplication(int a, int b){
        return a * b;
    }
    public String lower(String word){
        return word.toLowerCase();
    }
    public double divide(int a, int b ){
        return a / b;
    }


    public static boolean isPalindrome(String word){
        String reverse = "";
        for(int a =word.length() - 1; a >=0; a--){

     reverse = reverse + word.charAt(a);
        }

        if (reverse.equalsIgnoreCase(word)){
            return true;
        }else{
            return false;
        }
    }

public double hundred(double a){
      return  a*100;
}

public static boolean vowel(char a){
        if (a=='e' || a=='y' || a=='u' || a=='o' || a=='a' ){
            return false;

        }else{
            return true;
        }
}

public boolean diff5(int a , int b){
        int diff = Math.abs(a - b);
        if(diff == 5 || diff == -5){
            return true;
        }else{
            return false;
        }
}

public boolean email(String email){
        if (email.contains("@") && email.contains(".")){
            return true;
        }else {
            return false;
        }
}

public boolean prime(int prime ){
        if (prime % 2 ==0 && prime % 3 ==0){
            return true;
        }else{
            return false;
        }
}
public boolean parity(int a, int b){
        if ( a % 2 == 0 && b % 2== 0 || a % 2 !=0 && b % 2 !=0){
            return true;

        }else {
            return false;
        }
}


}
