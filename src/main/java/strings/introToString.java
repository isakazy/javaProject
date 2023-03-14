package strings;

public class introToString {
    public static void main(String[] args) {
        String city = "nywYork";
        //////in java there are 2 types of data: primitives and non primitives.primitives live in stock memory, non primitives live
        //// heap memory.
        //// name of the variables in java are called raferance
        ////string pool is the pool of memory that is in the heap memory(not on stack), it only stores strings.it is used to save memory in java
        //// to create new string with the same value we jus add (new String("aidana"))

        String me = "bishkek";
        System.out.println(me.length());
        String you = "hi, how are you? where are you from?";
        System.out.println(you.length());
        ///to finde out the number of characters of the value of the string we add after println .length()

        String ome="abc";
        String home= new String("abc");/// i used thr same string "abc" just by using the key word "new"
        ///String is immutable sequence of characters surrounded ""


        String school="codewise";
        school="codewise acadamy";////here java  unassigned "codewise" to "codewise academy"


     //   equals() method compares values of 2 Strings
        String fruit1="apple";
        String fruit2="apple";
        boolean isSame = fruit1.equals(fruit2);/// we use the word "equal to see if the are equal

        String fruit3="Apple";
        boolean issame= fruit1.equals(fruit3);
        System.out.println(issame);

        fruit1 = "orange";
        fruit2= "banana";
        System.out.println("isa banana same as orange?" + fruit1.equals(fruit2));
        boolean isSame2= !fruit1.equals(fruit2);
        System.out.println(isSame2);

        String state1= "california";//// state1-2 true
        String state2= "illinoi";   //// state2-4 true
        String state3= "Florida";     /// state 3-5 false
        String state4= "illinoi";    ////state1-5 false
        String state5= "florida"; //// state4-3 rue

        boolean letsSee= !state1.equals(state2);
        System.out.println(letsSee);
        boolean letsSee2= state2.equals(state4);
        System.out.println(letsSee2);
        boolean letsSee3= state3.equals(state5);
        System.out.println(letsSee3);
        boolean letsSee5= state1.equals(state5);
        System.out.println(letsSee5);
        boolean letsSee6= !state4.equals(state3);
        System.out.println(letsSee6);



        String myName= "Isakazy amanbaev";
        System.out.println(myName.length());
        System.out.println(myName.endsWith("amanbaev"));
        System.out.println(myName.isEmpty());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());

       myName = myName.toLowerCase();
       System.out.println(myName.charAt(0));
       System.out.println(myName.charAt(2));
       System.out.println(myName.charAt(6));
       System.out.println(myName.indexOf('y'));
       System.out.println(myName.indexOf('i'));


       String broName ="Nurgazy Amanbaev";
      boolean isequal= "BroName".equals(myName);
      System.out.println(isequal);
      isequal= myName. equals(broName);

      System.out.println(myName.equals (broName));
      System.out.println(!myName.equals(broName));
      System.out.println(myName==broName);


      String word= "banana apple food oil meet fish";
      System.out.println(word.replace('a','o'));
      word.replace('b','o');
      System.out.println(word);
      word=word.replace('b','o');
      System.out.println(word);
      word=word.replace('a','o');
      System.out.println(word);
      word=word.replace('n','o');
      System.out.println(word);
      word=word.replace('p','o');
      word=word.replace('l','o');
      word=word.replace('e','o');
      word=word.replace('f','o');
      word=word.replace('d','o');

      System.out.println(word);


      String food= "hot lentil soup, hot plov, cold compot, cold ice-cream, warm pasta, warm pizza";
      food=food.replace("hot","tasty");
      food=food.replace("cold","cool");
      food=food.replace("warm","italian");
      System.out.println(food);

      String massage= "hello chicago why are you cold and windy?";
      String gorod ="chicago";
      gorod =massage.substring(0,13);
      System.out.println(gorod);
      System.out.println(massage.substring(0,5));
gorod=massage.substring(0,13);
System.out.println(gorod);


String WelcomeSinge= "weclom to chicago, welcome to Usa our population is 150 million people our average sallery is";

         int a = WelcomeSinge.indexOf('U');
         System.out.println(a);
String country= WelcomeSinge.substring(30,33);
System.out.println(country);


country=WelcomeSinge.substring(WelcomeSinge.indexOf("150"),WelcomeSinge.indexOf("people"));
System.out.println(country);

country= WelcomeSinge.substring(WelcomeSinge.indexOf(','),WelcomeSinge.indexOf("our"));
System.out.println(country);


String thought= "just one positive thought in the morning can change your whole day";
String result = thought.substring(0,4) +" "+"a"+" " +thought.substring(18,25);
System.out.println(result);

result=thought.substring(9,17)+ " " +thought.substring(33,40);
System.out.println(result);

int beginIndex= WelcomeSinge.indexOf("150");
int endIndex= WelcomeSinge.indexOf("people");
System.out.println(beginIndex);
System.out.println(endIndex);
country= WelcomeSinge.substring(52,64);
System.out.println(country);

String wer="HI";
        String werw ="bye";
System.out.println(wer+ " " +werw);

String ab = "see";
String bc="hear";
System.out.println(bc.replace('h','s'));


System.out.println(thought. substring(9,17));

































    }



}