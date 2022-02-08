import java.util.Scanner;
public class backjoon6502{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a=1;
      do{
          int r=s.nextInt(); 
          if(r==0){
           break;   
          }
          int w=s.nextInt();
          int l=s.nextInt();
        
          if(w*w+l*l<=(2*r)*(2*r)){
              System.out.println("Pizza "+a+" fits on the table.");
          }else{
              System.out.println("Pizza "+a+" does not fit on the table.");
          }
          a++;
      }while(true);
    }
}