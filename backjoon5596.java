import java.util.Scanner;
public class backjoon5596
{
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int A=s.nextInt();
  int B=s.nextInt();
  int C=s.nextInt();
  int D=s.nextInt();
  
  int E=s.nextInt();
  int F=s.nextInt();
  int G=s.nextInt();
  int H=s.nextInt();

int max=0;
if(A+B+C+D>=E+F+G+H){
    max=A+B+C+D;
}else{
    max=E+F+G+H;
}
System.out.println(max);
	}
}