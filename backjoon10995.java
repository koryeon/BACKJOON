import java.util.Scanner;
public class backjoon10995 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
     
        for(int i=0;i<N;i++){
          if(N==1){
            System.out.print("*");
            break;
        }
        
          if(i%2==1){
               for(int h=0;h<N;h++){
                   System.out.print(" *");}
               }
          
           if(i%2==0){
               for(int j=0;j<N;j++){
                   System.out.print("* ");
               }
           } 
           System.out.print("\n");
  
            }
            System.out.print("\n");
        }
}
