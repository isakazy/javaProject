package ifElse;

import strings.StringPractice2;

import java.util.Scanner;

public class HomeWorkIfElse1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("print any character");
        String character = user.nextLine();


        if (character.equals("a") || character.equals("e") || character.equals("o") || character.equals("y") || character.equals("u") || character.equals("i")) {
            System.out.println("the character is vowel");
        } else {
            System.out.println("the character entered is consonant");
        }

////==================================================================================================================

        System.out.println("enter a grade");
        String grade = user.nextLine();
        if(grade.equals("A")){
            System.out.println("perfect");
        }else if (grade.equalsIgnoreCase("B")){
            System.out.println("good job");
        }else if(grade.equalsIgnoreCase("C")){
            System.out.println("work harder");
        }else if( grade.equalsIgnoreCase("d")){
            System.out.println("bad");
        }else if(grade.equalsIgnoreCase("e")){
            System.out.println("very bad study more");
        }else if(grade.equalsIgnoreCase("f")){
            System.out.println("vry poor i need to see your parents  ");
        }else {
            System.out.println("the cherecter is not valid");
        }

       ///============================================================================================//////
        char a = 'a';
        if (a >= 65 && a <= 90) {
            System.out.println("the character is capital");
        } else if (a >= 97 && a <= 122) {
            System.out.println("the character is lower");
        }
////======================================================///////////////==============//////////////////////=============





        System.out.println("enter age");
        int age = user.nextInt();

        if ( age<=17 && age >=18){
            System.out.println("you are good to vote");
        }else {
            System.out.println("you can not vote");
        }


////=================================================///////////////=================//////////////==================
        System.out.println("enter a word ");
        String word = user.nextLine();
        System.out.println("enter a second word");
        String word2 = user.nextLine();

        if(word.equalsIgnoreCase(word2)){
            System.out.println("the words are equal");
        }else if(!word.equalsIgnoreCase(word2)){
            System.out.println("the words are not equal");
        }else {
            System.out.println("not valid");
        }












        }









    }



