import java.util.Scanner;
public class backjoon5063 {
    public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int N=s.nextInt();
     int y=0;
     int n=0;
     for(int i=0;i<N;i++){
        int r=s.nextInt();
        int e=s.nextInt();
        int c=s.nextInt();
        if(r==e-c){
            System.out.println("does not matter");
        }else if(r>e-c){
            System.out.println("do not advertise");
        }else{
            System.out.println("advertise");
        }
     }
    }
}