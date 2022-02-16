import java.util.Scanner;
public class backjoon10797 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
    int num=s.nextInt();
    int sum=0;
    for(int i=0;i<5;i++){
        int a=s.nextInt();
        if(a==num){
            sum+=1;
        }
    }
    System.out.println(sum);
    }
}
