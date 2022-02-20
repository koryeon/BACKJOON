import java.util.Scanner;
public class backjoon10953 {
        public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         int T=sc.nextInt();
        
        for(int i=0;i<T;i++){
    
            String [] num=sc.next().split(",");
            int A=Integer.parseInt(num[0]);
            int B=Integer.parseInt(num[1]);
            System.out.println(A+B);
        }
         
        }
    }
