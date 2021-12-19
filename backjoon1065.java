import java.util.Scanner;
public class backjoon1065 {
    

    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int result=0;
    int cnt=0;
    int a=0;
    int b=0;
    int c=0;

    if(N<=99){
        result=N;
    }else if(100<=N && N<=110){
     result=99;
         
     }else if(111<=N&&1000>=N){
       for(int i=1;i<=N;i++){
          a=i/100;
          b=(i%100)/10;
          c=i%10;
          if(100*a+10*b+c>100){
                if(b-a==c-b){
              cnt++;
          }
          }
       }
        result=99+cnt;
    
    }
        System.out.println(result);
}

}
