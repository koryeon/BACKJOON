import java.util.Scanner;
public class backjoon1357 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        System.out.println(Rev(X,Y));    

    }
    public static int Rev(int X, int Y){
        if(X==1000){
            X=1000*(X%10)+100*((X%100)/10)+10*((X%1000)/100)+X/1000;
        }else if(X>=100){
            X=100*(X%10)+10*(X%100/10)+X/100;
        }else if(X>=10){
            X=10*(X%10)+X/10;
        }else{
            X=X;
        }
         if(Y==1000){
            Y=1000*(Y%10)+100*((Y%100)/10)+10*((Y%1000)/100)+Y/1000;
        }else if(Y>=100){
            Y=100*(Y%10)+10*(Y%100/10)+Y/100;
        }else if(Y>=10){
            Y=10*(Y%10)+Y/10;
        }else{
            Y=Y;
        }

        int sum=X+Y;
        if(sum>=1000){
            sum=1000*(sum%10)+100*((sum%100)/10)+10*((sum%1000)/100)+sum/1000;
        }else if(sum>=100){
            sum=100*(sum%10)+10*(sum%100/10)+sum/100;
        }else if(sum>=10){
            sum=10*(sum%10)+sum/10;
        }else{
            sum=sum;
        }
        return sum;
    }
}
