import java.util.Scanner;
public class backjoon1977 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int sum=0;
        int min=10000;
        for(int i=1;i<=Y;i++){
           if(i*i>=X&&i*i<=Y){
               sum+=i*i;
               if(i*i<=min){
                   min=i*i;
               }
           }
        }
     if(sum==0){
         System.out.println("-1");
     }else{
         System.out.println(sum);
         System.out.println(min);
     }
    }
}
