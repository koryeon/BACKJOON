package github.BACKJOON;
import java.util.Scanner;
public class backjoon2562 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
    
        int max=0;
        int num=0;
        for(int i=1;i<=9;i++){
            int N=s.nextInt();
            if(max<=N){
                max=N;
                num=i;
            }
        }
        System.out.println(max);
        System.out.println(num);
       }
    
}
