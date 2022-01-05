package github.BACKJOON;
import java.util.Scanner;
public class backjoon2441 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
          int N=s.nextInt();
        for(int i=N;i>0;i--){
            for(int h=N-i;h>0;h--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
            System.out.print("*");
            } 
            System.out.print("\n");
        }
      }
}
