package ForLoop;

public class HomeWorkPracticeForLoop {
    public static void main(String[] args) {

for( int a = 5; a <=50; a+=5){
    System.out.println(a);
}


for( int b = 2 ; b<=20; b+=2){
    System.out.println(b);
}

for( int c =10; c>=1;c-- ){
    System.out.println(c);
}



for( int d = 1; d<=10; d++){
    for( int e =1; e<=10; e++){
        System.out.print(d*e+"\t");
    }
    System.out.println();
}

for(int f= 1; f<=20; f+=2 ){
    System.out.println(f);
}

int sum= 0;
for(int g = 0; g<=50; g+=2){
    System.out.println(g);
    sum = sum+g;
}
        System.out.println(sum);



int number = 0;
for( int example = 1234; example > 0; example /=10){
    number = number + example % 10;
} System.out.println(number);


for( int h = 10 ; h >= 1; h--){
    for( int i =10; i>h; i--){
        System.out.print("*\t");
    }
    System.out.println();
}











}



    }

