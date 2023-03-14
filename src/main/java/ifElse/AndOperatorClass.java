package ifElse;

import java.util.Locale;

public class AndOperatorClass {
    public static void main(String[] args) {

        if (2 < 3) {
            System.out.println("hallo");
        }
        if (5 < 10) {
            System.out.println("hallo");

        }
        if (2 < 3 && 5 < 10) {
            System.out.println("hi");
        }/// they both must be true otherwise it will not execute the code
        if (true && false) {
            System.out.println();
        }////false

/// there is 4 conditional/logical operators
        //// && - and
        ///& single and
        /// || - or
        /// | - single or
        /// && is used to check multiple boolean condition java checks everything
        /// & single and only checks the program until it finds false

        String actualusername = "sunshine123";
        String actualpassword = "moonlight456";
        String actualEmail = "Isa@gmail.com";


        String username1 = "sunshine123";
        String password2 = "moonlight456";
        String enteredEmail = "Isa@gmail.com";


         /*
        if (username1.equals(actualusername)) {
         System.out.println("username is correct");
        } else if (password2.equals(actualpassword) && !username1.equals(actualusername)) {
            System.out.println("wrong username");
        } else if (actualpassword.equals(actualpassword) && username1.equals(actualusername)) {
            System.out.println("you are logged in");
        }
        else{
            System.out.println("go cook some dinner and come back");
        }

        if (username1.equals(actualusername) && password2.equals(actualpassword)) ;
        {
            System.out.println("you are in");
        }


        if (username1.equals(actualusername) && !password2.equals(actualpassword)) {
            System.out.println("WRONG PASSWORD");
        } else if (!username1.equals(actualusername) && password2.equals(actualpassword)) ;
        {
            System.out.println("wrong username");
        }

        if (username1.equals(actualusername) && password2.equals(actualpassword)) {
            System.out.println("YOU ARE IN");
        }
        else if (!enteredEmail.equals(actualEmail)){
            System.out.println("wrong email");
        }
        else{
            System.out.println("go play dota");
        }
        */
           if (username1.equals(actualusername) && password2.equals(actualpassword) && enteredEmail.equals(actualEmail)){
            System.out.println("Logged in");
        }
        if (username1.equals(actualusername) && !password2.equals(actualpassword)){
            System.out.println("incorrect password, try again");
        }
        if (!username1.equals(actualusername)){
            System.out.println("username doesn't exist");
        }
        if (!username1.equals(actualusername) && password2.equals(actualpassword) && enteredEmail.equals(actualEmail)){
            System.out.println("recover username");
        }
        else if (username1.equals(actualusername) && !password2.equals(actualpassword) && enteredEmail.equals(actualEmail)){
            System.out.println("recover password");
        }
        else if (username1.equals(actualusername) && password2.equals(actualpassword) && !enteredEmail.equals(actualEmail)){
            System.out.println("recover email");
        }
        else{
            System.out.println("get some sleep");
        }







        }





        }







