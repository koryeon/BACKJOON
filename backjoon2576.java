import java.util.Scanner;
public class backjoon2576 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        int min=100;
        int c=0;
        for(int i=0;i<7;i++){
           int a=s.nextInt();
           if(a%2==1){
           sum+=a;
               if(min>a){
                   min=a;
               }
           }else{
               c+=1;
           }
        }
    if(c==7){
               System.out.println("-1");
           }else{
           System.out.println(sum);
           System.out.println(min);}
       }
}
