import java.util.Scanner;
public class backjoon16673 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int sum=0;
       for(int i=0;i<=A;i++){
           sum+=i*(B+i*C);
       }
       System.out.println(sum);
     }
}
