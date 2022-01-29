import java.util.Scanner;
public class backjoon2747 {
 public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int T=s.nextInt();
    int[] arr=new int[46];
    int sum=0;
    arr[0]=0;
    arr[1]=1;
    for(int i =2;i<=T;i++){
        arr[i]=+arr[i-2]+arr[i-1];
    }
    System.out.println(arr[T]);
   }
}