import java.util.Scanner;
public class backjoon2908{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();

       X=100*(X%10)+10*(X%100/10)+X/100;
       Y=100*(Y%10)+10*(Y%100/10)+Y/100;
       if(X>=Y){
           System.out.println(X);
       }else{
           System.out.println(Y);
       }
        
    }
}