import java.util.Scanner;
public class backjoon5543
{
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int A=s.nextInt();
  int B=s.nextInt();
  int C=s.nextInt();
  int D=s.nextInt();
  int E=s.nextInt();
  int min=0;
  int min1=0;
  if(A>=B){
      if(B<=C){
          min=B;
      }else if(B>=C){
          min=C;
      }
  }else{
      if(A<=C){
          min=A;
      }else if(A>=C){
          min=C;
      }
  }
 
  if(D>=E){
      min1=E;
  }else{
      min1=D;
  }
  System.out.println(min+min1-50);
	}
}