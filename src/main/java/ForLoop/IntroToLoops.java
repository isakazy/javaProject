package ForLoop;

import java.util.Scanner;

public class IntroToLoops {
    public static void main(String[] args) {
        /// you could create variable outside, but you have to give it a value inside the code
        for(int a =1;  a<=10;  a++){
            System.out.println(a);
        }


        for(int apple =1;   apple<=10;   apple++)
        {
            System.out.println(apple + "apple");
        }

        for(int a = 1;  a<=100;   a++){
            System.out.println("2" + "*" +a+ "=" + (2*a));
        }

        for(int b = 1; b<=10; b++){
            System.out.println("java is fun");
        }


for( int a = 1; a<=10; a++){
    System.out.println(a);
}
for( int a = 10; a>=1; a--){
    System.out.println(a);
}

for(int c = 1; c<=20; c++){
    System.out.println(c+ " " +"apples");

}

for(int d = 1; d<=10; d++){
    System.out.println(2+ "*"+ d +"="+(2*d));
}

for(int e = 1; e<=10; e++){
    System.out.println("java is fun");
}
for(int f = 10; f>=1; f--){
    System.out.println("the value of x is:" + f);
}



for( int g = 10; g>=1; g -=2){
    System.out.println("the value of y is:"+  g );
}


for( int h = 1; h<=15; h+=2){
    System.out.println("the value of num is:"+ h);
}

int sum = 0;
for(int i = 1; i<=10; i++){
    System.out.println(i);
       sum = sum + i;

}
        System.out.println(sum);


int result = 5;
for(int j = 1; j<=20; j++){
    System.out.println(j);
    result = result * j ;
}
        System.out.println(result);


int summ= 0;

for(int k = 0; k<=100; k+=2){
    System.out.println(k);
    summ = summ+ k;
}
        System.out.println(summ);

for(int l = 1; l<=10; l++){
    for( int m = 1; m<=10; m++){
        System.out.print(l*m+"\t");
    }
    System.out.println();
}
for(int n=1; n<=15; n++){
    for(int o=1; o<=15; o++){
        System.out.print(n*o+"\t");
    }
    System.out.println();
}


for(int p=1; p<=10; p++){
    for(int q=1; q<=p; q++){
          System.out.print("*");
      }System.out.println();
    }










Scanner user = new Scanner(System.in);
        System.out.println("enter the number");
int number = user.nextInt();

boolean IsPrime = true;

for( int a = 2; a < number; a++){
    if( number % a ==0){
        IsPrime = false;
        break;
    }

    }

        if(IsPrime){
            System.out.println("the number is prime");
        }else {
            System.out.println("the number is not prime");
        }
}







    }






