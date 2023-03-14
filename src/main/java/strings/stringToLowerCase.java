package strings;

public class stringToLowerCase {
    public static void main(String[] args) {
        String word="hello everyone how are you doing";
        word=word.toLowerCase();
        System.out.println(word);////it made everything lowercase.


        String word2="HELLO GUYS I AM GOOD AND YOU?";
        word2=word;
        System.out.println(word);//// i made word2 lower case just by comparing them

        String word3= "hello everyone";
        String word4="HELLOW EVERYONE";
        word3=word4;
        boolean letsSee= word3.equals(word4);
        System.out.println(letsSee);


    }
}
