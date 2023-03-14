package strings;

public class StringSubString {
    public static void main(String[] args) {

        String massage= "hello chicago, why are you cold and windy?";
        String city= massage.substring(6,13);
        System.out.println(city);
         city= massage.substring(0,5);
         System.out.println(city);

         String welcomeSinge= "Welcome to USA, our population is 140 million people, "+"the everage salary is  90k" +
                 "and our president is Joe Biden";
         String country= welcomeSinge.substring(10,14);
         System.out.println(country);

         String population=welcomeSinge.substring(33,53);
         System.out.println(population);

            String salary=welcomeSinge.substring(76,80);
            System.out.println(salary);

            String president = welcomeSinge.substring(100,110);
            System.out.println(president);

            String phase = "Just one positive thought in the morning can change your whole day";
            String thought= phase.substring(0,4);
            System.out.println(thought);
            String thought1= phase.substring(18,25);
            System.out.println(thought);
            System.out.println(phase.substring(0,4)+ "a" +phase.substring(18,25));
            System.out.println(phase.substring(8,16) + phase.substring(31,40));
            System.out.println(phase.substring(55,60)+ phase.substring(31,40));
            System.out.println(phase.substring(45,51)+phase.substring(5,9)+phase.substring(63,66));
            int begIndex=phase.indexOf("morning");
            int endIndex=phase.indexOf("whole");
        System.out.println(phase.substring(begIndex,endIndex));

        String str1="hi";
        String str2= "bye";
        System.out.println(str1+str2+str1);
        System.out.println(str1+"="+str2+"="+str1+"="+str1+"=");

        System.out.println(str2.substring(0,1)+str1.substring(1,2));
        System.out.println(str1.replace('h','b'));

        String c = "c";
        String hear= "hear";
        System.out.println(hear.replace('h','c'));
        System.out.println(c.substring(0,1)+hear.substring(1));
        System.out.println(c.charAt(0)+hear.charAt(1));
















    }


}
