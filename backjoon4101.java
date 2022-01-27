import java.util.Scanner;
public class backjoon4101{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
       do{
        int A=s.nextInt();
        int B=s.nextInt();
        if(A==0&B==0){
            break;
        }
       if(A>B){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
       
       }while(true);
    }
}