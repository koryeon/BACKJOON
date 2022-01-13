import java.util.Scanner;
public class backjoon1110{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sum=0;
    int a=0;
    int b=0;
    int N=s.nextInt();
    int num=N;
    int temp=0;
        a= 10*(num%10)+((num/10)+(num%10))%10;  
    do{
        
    
        b=10*(a%10)+(a/10+a%10)%10;
        sum+=1;
          temp=a;
          a=b;
          b=temp;
        
        if(N==b){
        break;
    }
    } while(true);
   
        System.out.print(sum);
   
   
}
}