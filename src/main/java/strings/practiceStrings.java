package strings;

public class practiceStrings {
    public static void main(String[] args) {

        String singerName= "Micheal jackson";
        System.out.println(singerName.length());///number of chars
        System.out.println(singerName.endsWith("son"));//// GIVES ME BOOLEAN if it ends with jackson,son
        System.out.println(singerName.isEmpty());////tru another boolean
        System.out.println(singerName.toLowerCase());//it will only be lower here in the print, otherwise we have to declare it first
        System.out.println(singerName.toUpperCase());
        System.out.println(singerName.charAt(5));/// we can only put a number of letters no more (we are limited)
        System.out.println(singerName.indexOf("c"));/// index of shows me the number of the letter i request
        System.out.println();


            String singerName2= "Justin Bieber";
            boolean areTheSame= singerName2.equals(singerName);///true
            System.out.println(!singerName2.equals(singerName));///false
        singerName=singerName2;
        System.out.println(singerName2.equals(singerName2));/// true after we unassigned this




String water = "water";
 String front = water.substring(0,1);
 String back = water.substring(water.length()-1);
String sum = back + water + front;
        System.out.println(sum);




    }
}
