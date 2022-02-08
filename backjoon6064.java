import java.util.Scanner;
public class backjoon6064 {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int T=s.nextInt();
      for(int i=0;i<T;i++){
          int M=s.nextInt();
          int N=s.nextInt();
          int x=s.nextInt();
          int y=s.nextInt();
          int cnt=0;

          while(true){
              if((x-y)%N==0){
                 cnt=x;
                  break;
              }else if(x>M*N){
                  cnt=-1;
                  break;
              }
               x+=M;
          }
          
          System.out.println(cnt);
      }
    }
}