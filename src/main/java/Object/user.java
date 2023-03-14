package Object;

public class user {

    String username;
    String password;


    public void login(String username, String password){
        System.out.println(username+ "logged in to the application");
    }


    public static void main(String[] args) {
    user user = new user();
    user.login("zbc","abc123");


    }
}
