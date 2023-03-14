package ForLoop;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("enter a word ");

        String word = user.nextLine().replace(" ", "");
String reverse ="";
for(int a = word.length() -1; a >=0; a--){
   reverse = reverse+word.charAt(a);

}if (reverse.equalsIgnoreCase(word)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }






String word2 = user.nextLine();
String reverse2 = "";
for (int b = word2.length() -1; b<=0; b++){
    reverse2 = reverse2 + word2.charAt(b);
}

if(reverse.equalsIgnoreCase(word2)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }




Scanner user1 = new Scanner(System.in);
word = user.nextLine();


int sum = 0;













    }
}
