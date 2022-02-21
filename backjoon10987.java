import java.util.Scanner;
public class backjoon10987 {
        public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int cnt=0;
         String arr=s.next();
    
         for(int i=0;i<arr.length();i++){
             if(arr.charAt(i)=='a'||arr.charAt(i)=='e'||arr.charAt(i)=='i'||arr.charAt(i)=='o'||arr.charAt(i)=='u'){
                 cnt++;
             }
         }
         System.out.println(cnt);
        }
    }
