import java.util.Scanner;
public class backjoon10818 {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] arr= new int[N];
    int num=0;
   
    for(int j=0;j<N;j++){
        num=s.nextInt();
        arr[j]=num;
    }
     int min=arr[0];
    int max=arr[0];
    for(int i=0;i<N;i++){
        if(min>arr[i]){
            min=arr[i];
        }else if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.print(min+" "+max);
   
}
}
