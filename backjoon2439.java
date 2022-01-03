package github.BACKJOON;
import java.util.Scanner;
public class backjoon2439 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        
        for(int i=1;i<=N;i++){
            for(int a=N-i;a>0;a--){
                System.out.print(" ");
            }
           for(int j=1;j<=i;j++){
               
            System.out.print("*");
        }
            System.out.print("\n");
        }
    }
    
}
