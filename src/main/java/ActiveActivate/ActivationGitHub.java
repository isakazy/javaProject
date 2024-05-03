package ActiveActivate;

public class ActivationGitHub {
    public static void main(String[] args) {
        ActivationGitHub activationGitHub = new ActivationGitHub();
        activationGitHub.halfString("dumdum");
        activationGitHub.isAnagram("isakazy");


    }
    public void halfString(String str){
        int middle = str.length() / 2;
        String half = str.substring(middle);
        if(str.substring(0, middle).equals(str.substring(middle))){
            System.out.println("this is an halfString ");
        }
        else{
            System.out.println("this is not an halfString");
        }
    }

    public void isAnagram(String str){
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i --){
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)){
            System.out.println("this is anagram");
        }
        else {
            System.out.println("this is not an anagram ");
        }
    }
}
