import java.util.Scanner;
public class backjoon10994 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        
         for(int i=2*N-1;i>0;i--){
             if(N==1){
                 System.out.print("*");
                 break;
             }else if(i==1){
               for(int a=1;a<=2*N-1;a++){
                   System.out.print("* ");
               }
           }else if(i%2==1){
               if(i!=2*N-1){
                    for(int l=-N;l<N-i-1;l+=2){                
                   System.out.print("* ");
               }
               }
              
                for(int h=2*i-1;h>0;h--){
               System.out.print("*");
          }if(i!=2*N-1){
               System.out.print(" "); 
               for(int u=1;u<=2*N-i-1;u+=2){                     
                System.out.print("* ");
           }
           
          }
               
           }else if(i%2==0){
               for(int d=i;d<2*N;d+=2){
                   System.out.print("* ");
                }   
              for(int e=2*(N*i)-N-1;e>N;e-=N){
                  System.out.print(" ");
              }
               for(int f=i;f<2*N;f+=2){
                   System.out.print("* ");
                }  
               
           }
  
        System.out.print("\n");
        }
      
      
      
      
      
      for(int b=1;b<2*N-1;b++){
  
           if(b%2==0){
               for(int s=2*N-b-2;s>0;s-=2){
                   System.out.print("* ");
               }
                for(int h=0;h<2*b+1;h++){
               System.out.print("*");
           }
           if(b!=2*N-2){
               System.out.print(" ");
           }
           
           for(int o=2*N-b-2;o>0;o-=2){
               System.out.print("* ");
           }
           }else if(b%2==1){
               for(int z=2*N;z>b+1;z-=2){
                   System.out.print("* ");
               }
               for(int x=2*N;x<2*N+2*b;x++){
                   System.out.print(" ");
               }
               for(int y=N-2;y>b-N;y-=2){
                   System.out.print("* ");
               }
           }
          
           System.out.print("\n");
       }
       
      }
}
