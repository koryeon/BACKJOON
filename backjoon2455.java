import java.util.Scanner;
public class backjoon2455 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
    
        int max=0;
        int c=0;
        for(int i=0;i<4;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            c+=b;
            c-=a;
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    
    }
}
