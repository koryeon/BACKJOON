import java.util.Scanner;
public class  backjoon2953 {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int sum=0;
      int max=0;
      int num=0;
      for(int i=1;i<6;i++){
          for(int j=0;j<4;j++){
              int a=s.nextInt();
              sum+=a;
          }
          if(max<sum){
              max=sum;
              num=i;
          }
          sum=0;
      }
      System.out.print(num+" ");
      System.out.println(max);
    }
}