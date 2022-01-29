import java.util.Scanner;
public class backjoon2525 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
       int hour=s.nextInt();
       int min=s.nextInt();
       int N=s.nextInt();
       int a=hour+N/60;
       int b=min+N%60;
     
     if(b/60>0){
         a=b/60+hour+N/60;
     }
     if(a>23){
         a=a-24;
     }
     if(b>=60){
         b=b-60;
     }
     System.out.format("%d %d",a,b);
     
       
     
       }
    
}
