import java.util.Scanner;
public class backjoon10039 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int sum=0;
     for(int i=0;i<5;i++){
         int f=s.nextInt();
         if(f<40){
             sum+=40;
         }else{
             sum+=f;
         }
     }
     System.out.println(sum/5);
     
    }
}
