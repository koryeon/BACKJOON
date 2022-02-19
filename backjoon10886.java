import java.util.Scanner;
public class backjoon10886 {
        public static void main(String args[]) {
         Scanner s = new Scanner(System.in);
         int N=s.nextInt();
         int y=0;
         int n=0;
         for(int i=0;i<N;i++){
             int a=s.nextInt();
             if(a==0){
                 n+=1;
             }else{
                 y+=1;
             }
         }
         if(y>n){
             System.out.println("Junhee is cute!");
         }else{
             System.out.println("Junhee is not cute!");
         }
     
        }
    }
