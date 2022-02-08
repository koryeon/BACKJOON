import java.util.Scanner;
public class backjoon8394{
    public static void main(String args[]){

    Scanner s=new Scanner(System.in);
   int N=s.nextInt();
   int b=0;
    for(int i=1;i<=N;i++){
        b+=i;
        
    }
    System.out.println(b);
}
}