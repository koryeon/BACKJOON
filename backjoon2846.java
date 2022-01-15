import java.util.Scanner;
public class backjoon2846 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
      int N=s.nextInt();
      int b=s.nextInt();
      int sum=0;
      int max=0;
      for(int i=0;i<N-1;i++){
          int a=s.nextInt();
         
          if(b<a){
             sum+=a-b;
          } if(max<=sum){
              max=sum;
          }
          if(b>=a){
              sum=0;
          }
          b=a;
      }
      System.out.println(max);
      
       }
}
