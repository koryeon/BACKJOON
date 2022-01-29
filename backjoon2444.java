import java.util.Scanner;
public class backjoon2444 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
   
         for(int i=0;i<N-1;i++){
            for(int j=i;j<N-1;j++){
                System.out.print(" ");
            }
            for(int h=0;h<2*i+1;h++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
       
        for(int i=N;i>0;i--){
            for(int j=N-i;j>0;j--){
                System.out.print(" ");
            }
            for(int h=2*i-1;h>0;h--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        
       }
}