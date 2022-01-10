package github.BACKJOON;
import java.util.Scanner;
public class backjoon2577 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sum=1;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int j=0;
        int k=0;
        int num=0;
        for(int i=0;i<3;i++){
            sum*=s.nextInt();
        }
        while(sum>0){
            num=sum%10;
            if(num==0){
                a+=1;
            }else if(num==1){
                b+=1;
            }else if(num==2){
                c+=1;
            }else if(num==3){
                d+=1;
            }else if(num==4){
                e+=1;
            }else if(num==5){
                f+=1;
            }else if(num==6){
                g+=1;
            }else if(num==7){
                h+=1;
            }else if(num==8){
                j+=1;
            }else if(num==9){
                k+=1;
            }
            sum/=10;
            
            
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
       }
    
}
