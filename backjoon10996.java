import java.util.Scanner;
public class backjoon10996 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
     
        for(int i=0;i<2*N;i++){
          if(N==1){
            System.out.print("*");
            break;
        }
        
          if(i%2==1){
               for(int h=1;h<N/2+1;h++){
                   System.out.print(" *");}
               }
          
           if(i%2==0){
               if(N%2==0){
                   for(int k=1;k<N/2+1;k++){
                       System.out.print("* ");
                   }
               }else{
                    for(int j=0;j<N/2+1;j++){
                   System.out.print("* ");
               }
               }
              
           } 
           System.out.print("\n");
  
            }
            System.out.print("\n");
        }
}
