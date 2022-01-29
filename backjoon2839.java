import java.util.Scanner;
public class backjoon2839 {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        
        int a=s.nextInt();
        int cnt=0;
       
   
       while(a>0){
           if(a%5==0){
               cnt+=a/5;
               a=0; break;
           }
           else{
               a-=3;
               cnt++;
           }
       }
       System.out.print((a<0)?-1:cnt);
   
      
       }
}
