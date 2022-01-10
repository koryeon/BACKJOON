package github.BACKJOON;
import java.util.Scanner;
public class backjoon2588 {
    public static void main(String args[]){
     
    
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        
        int c=a*(b%10);
        int d=a*((b/10)-(10*(b/100)));
        int e=a*(b/100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c+10*d+100*e);
        
    }
}
