import java.util.Scanner;
public class backjoon9085 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int N=s.nextInt();
     int sum=0;
     for(int i=0;i<N;i++){
       int T=s.nextInt();
       for(int j=0;j<T;j++){
           int a=s.nextInt();
           sum+=a;
       }
       System.out.println(sum);
       sum=0;
     }
    }
}