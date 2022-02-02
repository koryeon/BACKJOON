import java.util.Scanner;
public class backjoon5565 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int N=s.nextInt();
     int sum=N;
     
     for(int i=0;i<9;i++){
         int num=s.nextInt();
         sum-=num;
     }
     System.out.println(sum);
    }
}