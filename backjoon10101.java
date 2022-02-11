import java.util.Scanner;
public class backjoon10101 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int sum=0;
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
      if(a+b+c==180){
          if(a==60&&b==60&&c==60){
           System.out.println("Equilateral");
       }else if(a==b||b==c||c==a){
           System.out.println("Isosceles");
       }else{
           System.out.println("Scalene");}
      }else{
          System.out.println("Error");
      }
    }
}
