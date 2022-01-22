import java.util.Scanner;
public class backjoon2754 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String res=sc.next();
      if(res.equals("A+")){
          System.out.println("4.3");
      }else if(res.equals("A0")){
          System.out.println("4.0");
      }else if(res.equals("A-")){
          System.out.println("3.7");
      }else if(res.equals("B+")){
          System.out.println("3.3");
      }else if(res.equals("B0")){
          System.out.println("3.0");
      }else if(res.equals("B-")){
          System.out.println("2.7");
      }else if(res.equals("C+")){
          System.out.println("2.3");
      }else if(res.equals("C0")){
          System.out.println("2.0");
      }else if(res.equals("C-")){
          System.out.println("1.7");
      }else if(res.equals("D+")){
          System.out.println("1.3");
      }else if(res.equals("D0")){
          System.out.println("1.0");
      }else if(res.equals("D-")){
          System.out.println("0.7");
      }else if(res.equals("F")){
          System.out.println("0.0");
      }

    }
}
