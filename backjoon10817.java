import java.util.Scanner;
public class backjoon10817 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int mid=0;
  if(A>=B){
      if(A<=C){
          mid=A;
      }else if(B>=C){
          mid=B;
      }else if(B<=C){
          if(A<=C){
              mid=A;
          }else if(A>=C){
              mid=C;
          }
      }
  }else if(A<=B){
      if(A>=C){
          mid=A;
      }else if(A<=C){
          if(C<=B){
              mid=C;
          }else if(C>=B){
              mid=B;
          }
      }
  }
        System.out.println(mid);
    }
}
