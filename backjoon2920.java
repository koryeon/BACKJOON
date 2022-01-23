import java.util.Scanner;
public class backjoon2920  {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int sum=1;
    int cnt=8;
    int a=0;
    int b=0;
    for(int i=0;i<8;i++){
        int N=s.nextInt();
        if(N==sum){
            sum+=1;
            a+=1;
        }else if(N==cnt){
            cnt--;
            b+=1;
        }
    }
    if(a==8){
        System.out.print("ascending");
    }else if(b==7){
        System.out.print("descending");
    }else{
        System.out.print("mixed");
    }
     }
}
