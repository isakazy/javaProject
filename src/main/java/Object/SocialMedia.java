package Object;

public class SocialMedia {

    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;




    public void printPassword(String printPassword) {
        if (printPassword.length() > 16 && printPassword.contains(" ") && password.length()< 8) {
            System.out.println("not valid please try agan");
            String upperCaseRegex = "[A-Z]";
            String lowerCaseRegex ="[a-z]";
            String digitRegex = "\\d";
            String specialCharRegex = "[!@#\\$%^\\*()+_*(&^";
            if(!password.matches(upperCaseRegex)|| !password.matches(lowerCaseRegex)||!password.matches(digitRegex)||
            !printPassword.matches(specialCharRegex)){
                System.out.println("valid password");
            }else{
                System.out.println("the password you entered is not valid pleas enter a valid password");
            }
        }
    }
;
    public void setPassword(String newPassword){

    }

    public void resetPassword(String reset) {
    setPassword(password);
    }

    public void fullName(String firstName, String LastName) {
String fullName = firstName + lastName;
    }

  public void setUpUserName(String userName){
        boolean isValidName = true;
        if(userName.equals(null) || userName.isEmpty() || userName.length()<16 || userName.trim().length()==0){
            isValidName = false;

        }if(isValidName){
          System.out.println("valid user name");
      }else {
          System.out.println("error");
      }


  }public boolean age(){
        boolean isAdult;
        if(age<18){
           return true;

        }else {
            return false;
        }
    }




}
