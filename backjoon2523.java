import java.util.Scanner;
public class backjoon2523 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
     for(int i=1;i<=N;i++){
          for(int j=1;j<=i;j++){
           System.out.print("*");
       }
       System.out.print("\n");
       }
       for(int a=N-1;a>0;a--){
             for(int b=a;b>0;b--){
             System.out.print("*");
             }
             System.out.print("\n");
         }}
}
