import java.util.Scanner;
public class backjoon10250{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
        int H=s.nextInt();
        int W=s.nextInt();
        int N=s.nextInt();
        int sum=0;
        
        if(N%H==0){
            sum=H*100+N/H;
        }else{
            sum=(N%H)*100+N/H+1;
        }
        System.out.println(sum);
     }
    }
}