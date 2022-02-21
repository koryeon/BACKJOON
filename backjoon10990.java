import java.util.Scanner;
public class backjoon10990 {
        public static void main(String args[]) {
          Scanner s = new Scanner(System.in);
          int N=s.nextInt();
          
          
          for(int i=N;i>0;i--){
              if(N==1){
              System.out.print("*");
              break;
          }
              for(int j=i;j>1;j--){
                  System.out.print(" ");
              }
                 System.out.print("*");
                 if(i==N){
                     System.out.print(" ");
                 }
      
              for(int h=2*N-2*i-1;h>0;h--){
                  System.out.print(" ");
                   
              }
               if(i==1){
                    System.out.print("*");
                }
                else if(i<N){
                     System.out.print("* ");
                }
                 
              
              System.out.print("\n");
          }
          
        
        }
    }
