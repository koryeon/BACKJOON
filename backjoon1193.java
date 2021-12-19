import java.util.Scanner;
public class backjoon1165 {
    
public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
    int N=s.nextInt();
    int a=0;
    int b=0;
    int c=3;
    int d=2;
    int cnt=1;
    if(N==1){
        a=1;
        b=1;
    }else{

        do{
          a++;
          cnt++;
          if(cnt==N){
              break;
          }
            else if(a==c){
                do{
                a--;
                cnt++;
                 if(cnt==N){
              break;
          }
                 if(a==1){
                     a=1;
                     cnt++;
                     c+=2;
                     break;
                  }
                }while(cnt!=N);
            }
        }while(cnt!=N);
      cnt=0;
   do{
           b++;
           cnt++;
           if(cnt==N){
               break;
           }
            else if(b==d){
                do{
                b--;
                cnt++;
                 if(cnt==N){
               break;
           }
                 if(b==1){
                     b=1;
                     cnt++;
                     d+=2;
                     break;
                   }
                }while(cnt!=N);
            }
        }while(cnt!=N);
    }
        System.out.println(a+"/"+b);
    

    }
}
}
