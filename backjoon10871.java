import java.util.Scanner;
public class backjoon10871 {
        public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int X=s.nextInt();
        for(int i=1;i<=N;i++){
          int A= s.nextInt();
          if(A<X){
              System.out.print(A+" ");
          }
        }
    }
    }
