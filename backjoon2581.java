import java.util.Scanner;
public class backjoon2581 {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
      int M=s.nextInt();
      int N=s.nextInt();
      int sum=0;
      int min=10000;
      int cnt=0;
      for(int i=M;i<=N;i++){
          cnt=0;
          for(int j=2;j<=i;j++){
              if(i%j==0){
                  if(i==j){
                      break;
                  }
                  cnt+=1;
                  break;
              }
          }
           if(cnt==0&&i>1){
             sum+=i;
            if(min>=i){
                min=i;
                  }
      }
      }
      if(sum==0){
          System.out.println("-1");
      }else{
          System.out.format("%d\n%d",sum,min);
      }
    }

}