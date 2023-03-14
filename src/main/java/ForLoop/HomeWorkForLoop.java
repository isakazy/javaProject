package ForLoop;

public class HomeWorkForLoop {
    public static void main(String[] args) {
for( int a = 5; a<=50; a+=5){
    System.out.println(a);
    }
for( int c = 2; c <=20; c+=2){
    System.out.println(c);
}

for(int d = 10; d>=1; d--){
    System.out.println(d);
}
for(int e = 1; e <=5; e++){
    for(int f = 1; f<=5; f++){
       int result = e*f;
        System.out.print(result+"\t");
    }
    System.out.println();

}

for(int g = 2; g<=20; g+=2){
    System.out.println(g);
}

int i=0;

for(int h =1; h<=100; h++){
  if(h % 2 == 0){
      System.out.println(h);
      i=i+h;
  }
}
        System.out.println(i);



int example = 1234;
int number = 0;
for( int j = example; j>0; j/=10 ){
    number +=j % 10;

    System.out.println(number);

    }

for ( int a = 10; a>=1; a--){
    for(int b = 1; b<=a; b++){
        System.out.print("*");
    }
    System.out.println();
}

        for(int c=1; c<=4;c++) {
            for (int d = 1; d <= c; d++) {
                System.out.print(c);



            }
            System.out.println();
        }


}
}
















