import java.util.Scanner;
public class backjoon2445 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
       for(int i=1;i<N;i++){
          for(int j=1;j<=i;j++){
           System.out.print("*");
       }
         for(int a=2*N-2*i;a>0;a--){
               System.out.print(" ");
           }
       
       for(int j=1;j<=i;j++){
              
           System.out.print("*");
       }
       System.out.print("\n");
       }
       
       
       for(int i=N;i>0;i--){
             for(int j=i;j>0;j--){
             System.out.print("*");
             }
             for(int h=0;h<2*(N-i);h++){
                 System.out.print(" ");
             }
             for(int j=i;j>0;j--){
             System.out.print("*");
             } 
   
             
             System.out.print("\n");
         }
     
   }
}
