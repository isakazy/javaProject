package Object;

public class Rectangle {

    int width = 7;
    int height = 5;

    public void calculateArea(){
        System.out.println(width * height);
    }
    public void calculatePerimeter(){
        System.out.println((width+height) * 2);
    }


    public static void main(String[] args) {

        Rectangle result = new Rectangle();

        System.out.println(result.height);
        System.out.println(result.width);


        result.calculateArea();
        result.calculatePerimeter();


    }



}
