import java.util.Scanner;
public class backjoon1292 {
    
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int A=s.nextInt();
    int B=s.nextInt();
    int cnt = 0;
    int sum=0;
    for(int i=1;i<=45;i++){
       for(int j=1;j<=i;j++){
           cnt++;
           if(A<=cnt && cnt<=B) 
           sum+=i;
       }
    }
        System.out.println(sum);
}
}

