import java.util.Scanner;
public class backjoon2420 {

    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     long N=sc.nextInt();
     long M=sc.nextInt();
     long result=N-M;
     
     if(result<0){
         result=result*(-1);
     }
     System.out.println(result);
    }
}
    

