import java.util.Scanner;
public class backjoon2750 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=0;
      int [] var = new int [a];
      for(int i=0;i<a;i++){
          var[i]=sc.nextInt();
      }

      for(int r=0;r<a;r++){
          for(int l=0;l<a-r-1;l++){
              if(var[l]>var[l+1]){
              b=var[l];
              var[l]=var[l+1];
              var[l+1]=b;
          }
          }
          

      }
      for( int g=0;g<a;g++){
         System.out.println(var[g]);
      }

    }
}
