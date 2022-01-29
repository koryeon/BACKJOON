import java.util.Scanner;
public class backjoon2506 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
       
       int N=s.nextInt();
       int sum=0;
       int num=1;
       for(int i=0;i<N;i++){
           int a=s.nextInt();
           if(a==1){
               sum+=num;
               num++;
           }else{
               num=1;
           }
       }
       System.out.println(sum);
   
       }
    
}
