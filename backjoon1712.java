import java.util.Scanner;
public class backjoon1712 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
       int A=s.nextInt();
       int B=s.nextInt();
       int C=s.nextInt();
       int i=1;
       
        if(B>=C){
               System.out.println("-1");
           }else if(C-B==1){
               System.out.println(A+1);
           }else{do{
           if((C-B)*i>A){
           System.out.println(i);
               break;}
               else{
                i+=1;
           }
       }while(true);}
  }
    
}
