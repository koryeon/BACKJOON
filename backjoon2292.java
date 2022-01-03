package github.BACKJOON;
import java.util.Scanner;
public class backjoon2292 {

    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
    long N=s.nextInt();
// 1 6 12 18 24 30 
        int sum=1;
        int res=1;
        int i=0;
        if(N==1){
            res=1;
        }else{
            do{
                sum+=i*6;
                if(sum<N){
                    res+=1;
                    i++;
                }else{
                    break;
                }
            }while(true);
         
        }

        System.out.println(res);
    }
}
    

