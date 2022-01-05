package github.BACKJOON;
import java.util.Scanner;
public class backjoon2442 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for(int i=0;i<N;i++){
            for(int j=i;j<N-1;j++){
                System.out.print(" ");
            }
            for(int h=0;h<2*i+1;h++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        
       }
}
