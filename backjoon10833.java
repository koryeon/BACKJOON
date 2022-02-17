import java.util.Scanner;
public class backjoon10833 {
        public static void main(String args[]) {
          Scanner s =new Scanner(System.in);
          int T=s.nextInt();
          int sum=0;
          for(int i=0;i<T;i++){
              int A=s.nextInt();
              int B=s.nextInt();
              sum+=B%A;
          }
          System.out.println(sum);
        }
    }
