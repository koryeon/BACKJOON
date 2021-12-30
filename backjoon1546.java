import java.util.Scanner;
public class backjoon1546 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
       int N=s.nextInt();
       int []arr=new int[N];
       int num=0;
       double sum=0;
       for(int i=0;i<N;i++){
           num=s.nextInt();
           arr[i]=num;
       }
       int max=0;
       max=arr[0];
       for(int i=0;i<N;i++){
           if(max<=arr[i]){
               max=arr[i];
           }
       }
       
       for(int i=0;i<N;i++){
           sum+=arr[i];
    
       }
       sum=(sum/max)*100;
     System.out.println(sum/N);
    }
}
