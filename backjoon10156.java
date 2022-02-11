import java.util.Scanner;
public class backjoon10156 {
        public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         int K=sc.nextInt();
         int N=sc.nextInt();
         int M=sc.nextInt();
         int A=K*N;
        if(A<=M){
            System.out.println("0");
        }else if(A>M){
            System.out.println(A-M);
        }
        }
    }
