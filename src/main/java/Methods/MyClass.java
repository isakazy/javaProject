package Methods;

public class MyClass {


    public static void me (String name , int age){
        System.out.println("my name is"+name + " i am " + age+" years old ");
    }

    public static void nurgazy(String fullName, int age, String placeOfWork){
        System.out.println("his name is " + fullName+ " he  is "+  age+ " years old, and he works in  "+ placeOfWork );
    }
    public void  kfc( int a, int b){
        System.out.println(a + b);


}

    public static int add( int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        MyClass isa = new MyClass();

        isa.me("isakazy",26);

        isa.nurgazy("amanbaev Nurgazy", 25, "Skokie");


        isa.kfc(12,85756464);

       int sum =  add(43,65) ; {
            System.out.println(sum);
        }
    }
}
