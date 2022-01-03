package github.BACKJOON;
import java.util.Scanner;
public class backjoon2440 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
          int N=s.nextInt();
        for(int i=N;i>0;i--){
            for(int j=i;j>0;j--){
            System.out.print("*");
            }
            System.out.print("\n");
        }
      }
}
