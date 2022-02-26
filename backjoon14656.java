import java.util.Scanner;
public class backjoon14656 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        
        for(int i=1;i<N+1;i++){
            int num=s.nextInt();
            if(num!=i){
                sum+=1;
            }
        }
        System.out.println(sum);
       }
}
